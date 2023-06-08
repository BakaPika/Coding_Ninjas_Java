public class Solution {
	public static ArrayList<Integer> query(ArrayList<ArrayList<Integer>> mat, int m, int n, ArrayList<String> q) {
		
		ArrayList<Integer> result = new ArrayList<>();

        int k = 0;

        while(k < q.size())
        {
            String value = q.get(k);
            char type = value.charAt(0);
            if(type == '1')
            {
                if(q.get(k).charAt(1) == 'R')
                {
                    int i = 0;
                    while(i < mat.get(0).size())
                    {
                        int row = (value.charAt(2) - 48);
                        int element = mat.get(row).get(i);
                        if(element == 0)
                        {
                            element = 1;
                        }
                        else
                        {
                            element = 0;
                        }
                        mat.get(row).set(i, element);
                        i++;
                    }
                }

                else if(q.get(k).charAt(1) == 'C')
                {
                    int i = 0;
                    while(i < mat.get(0).size())
                    {
                        int col = (value.charAt(2) - 48);
                        int element = mat.get(i).get(col);
                        if(element == 0)
                        {
                            element = 1;
                        }
                        else
                        {
                            element = 0;
                        }
                        mat.get(i).set(col,element);
                        i++;
                    }
                }

            }

            else if(type == '2')
            {
                if(q.get(k).charAt(1) == 'R')
                {
                    int count = 0;
                    int i = 0;
                    while(i < mat.get(0).size())
                    {
                        int row = (value.charAt(2) - 48);
                        int element = mat.get(row).get(i);
                        if(element == 0)
                        {
                            count++;
                        }
                        i++;
                    }
                    result.add(count);
                }

                else if(q.get(k).charAt(1) == 'C')
                {
                    int count = 0;
                    int i = 0;
                    while(i < mat.size())
                    {
                        int col = (value.charAt(2) - 48);
                        int element = mat.get(i).get(col);
                        if(element == 0)
                        {
                            count++;
                        }
                        i++;
                    }
                    result.add(count);

                }
            }
            k++;
        }

		return result;
	}
}
