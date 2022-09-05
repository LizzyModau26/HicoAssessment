using System.IO;
using System;

namespace Assignment
{
    public class Winner
    {
        /// <summary>
        ///     Main method running our output.
        /// </summary>
        static void Main()
        {
            string path = "C://Users/User/Desktop/Assignment/abc.txt";
            string output_path = "C://Users/User/Desktop/Assignment/xyz.txt";
            Process(path, output_path);
        }
        /// <summary>
        ///     Method used to get our results.
        /// </summary>
        /// <param name="path">Read file path</param>
        /// <param name="output_path">Write file path</param>
        public static void Process(string path = "abc.txt", string output_path = "xyz.txt")
        {

            (List<int> FaceValue_Arr, List<int> SuitValue_Arr) = GetCards(path);
            (int WinnerPos, int WinnerScore) = GetWinner(FaceValue_Arr, SuitValue_Arr);
            string results = WriteToText(WinnerPos, WinnerScore, output_path);
            Console.WriteLine(results);
        }

        /// <summary>
        ///     Method used to give our face cards values.
        /// </summary>
        /// <param name="card_val"></param>
        /// <returns></returns>
        public static int FaceValues(string card_val)
        {
            int res = 0;

            if (card_val != "A" && card_val != "Q" && card_val != "K" && card_val != "J")
            {
                res = Int32.Parse(card_val);
            }
            else if (card_val == "A")
            {
                res = 1;
            }
            else if (card_val == "Q")
            {
                res = 12;
            }
            else if (card_val == "K")
            {
                res = 13;
            }
            else if (card_val == "J")
            {
                res = 11;
            }

            return res;
        }

  

        /// <summary>
        ///     Method used to give our suit cards values
        /// </summary>
        /// <param name="cardSuit_val"></param>
        /// <returns></returns>
        public static int SuitValues(char cardSuit_val)
        {
            int res = 0;
            if (cardSuit_val == 'S')
            {
                res = 4;
            }
            else if (cardSuit_val == 'H')
            {
                res = 3;
            }
            else if (cardSuit_val == 'D')
            {
                res = 2;
            }
            else if (cardSuit_val == 'C')
            {
                res = 1;
            }

            return res;
        }

        /// <summary>
        ///     Method used to get cards and calculate the sum of cards for each player.
        /// </summary>
        /// <param name="path"></param>
        /// <returns></returns>
        public static(List<int>, List<int>) GetCards(string path)
        {
            List<int> FaceValue_Arr = new List<int>();
            List<int> SuitValue_Arr = new List<int>();

            string[] lines = File.ReadAllLines(path);
            foreach (string line in lines)
            {
                string[] splitCard = line.Split(":");
                splitCard = splitCard[1].Split(",");
                int FaceValue_sum = 0;
                int SuitValue_sum = 0;
                for(int i = 0; i < splitCard.Length; i++)
                {
                  
                    string FaceValue = splitCard[i].Replace("\n", "");
                    FaceValue = FaceValue.Remove(FaceValue.Length - 1);
                  
                    int CardFace_val = FaceValues(FaceValue);
                    FaceValue_sum = FaceValue_sum + CardFace_val;
                    char SuitValue = FaceValue[FaceValue.Length - 1];
                   
                    int CardSuit_val = SuitValues(SuitValue);
                    SuitValue_sum = SuitValue_sum + CardSuit_val;
                }
                FaceValue_Arr.Add(FaceValue_sum);
                SuitValue_Arr.Add(SuitValue_sum);

            }
            return (FaceValue_Arr, SuitValue_Arr);
           
        }

        /// <summary>
        ///     Method used to get the winner.
        /// </summary>
        /// <param name="FaceValue_Arr"></param>
        /// <param name="SuitValue_Arr"></param>
        /// <returns></returns>
        public static(int WinnerPos, int WinnerScore) GetWinner(List<int> FaceValue_Arr, List<int> SuitValue_Arr)
        {
            int WinnerPos = FaceValue_Arr.IndexOf(FaceValue_Arr.Max());
            int WinnerScore = FaceValue_Arr.Max();
            if (FaceValue_Arr.Count(n => n == WinnerScore) == 1) {
                return (WinnerPos, WinnerScore);
            }
            else
            {
                int n = FaceValue_Arr.Count;
                List<int> SuitArr = new List<int>(n);
                for (int i = 0; i < n; i++)
                {
                    SuitArr.Add(0);
                }

                List<int> SuitVal_pos = SearchArrayForDuplicatedScore(FaceValue_Arr, WinnerScore);

     
                for (int i = 0; i < SuitVal_pos.Count; i++)
                {
                    int idx = SuitVal_pos[i];
                    SuitArr[idx] = SuitValue_Arr[idx];
                }
                WinnerPos = SuitArr.IndexOf(SuitArr.Max());
                WinnerScore = SuitArr.Max();
                if (SuitArr.Count(n => n == WinnerScore) == 1)
                {
                    return (WinnerPos, WinnerScore);
                }
                else
                {
                    WinnerPos = -1;
                    WinnerScore = -1;
                    Console.WriteLine("bvcc",(WinnerPos, WinnerScore));
                }

            }

            return (WinnerPos,WinnerScore);
           
           
           
        }

        /// <summary>
        ///     Method used to search for duplicated score or ties.
        /// </summary>
        /// <param name="array"></param>
        /// <param name="WinnerScore"></param>
        /// <returns></returns>
         public static List<int> SearchArrayForDuplicatedScore( List<int> array, int WinnerScore)
        {
            List<int> idxList = new List<int>();

            for (int i = 0; i < array.Count; i++)
            {
                if(array[i] == WinnerScore)
                {

                    idxList.Add(i);
                }
            }
            return idxList;
        }

        /// <summary>
        ///     Method to write our results to our write file.
        /// </summary>
        /// <param name="WinnerPos"></param>
        /// <param name="WinnerScore"></param>
        /// <param name="output_path"></param>
        /// <returns></returns>
        public static string WriteToText(int WinnerPos, int WinnerScore, string output_path)
        {

            string[] results = new string[] { "Winner Position: " + WinnerPos , "Score:" + WinnerScore};
            using StreamWriter sw = new StreamWriter(output_path);
            {

                foreach (string s in results)
                {
                    sw.WriteLine(s);
                }
            }
            return results[0];
        }


    }
}