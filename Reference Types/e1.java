class e1
{
    static public String ciphering(String normal)
    {
        StringBuilder sb = new StringBuilder(normal);
    
        // 1 -> SwapCase
        for( int i=0; i<sb.length(); i++ )
        {
            if( Character.isUpperCase(sb.charAt(i)))
            {
                int temp1 = (int) sb.charAt(i);
                temp1+= 32;
                char ch =(char)temp1;
                sb.setCharAt(i, ch);
            }
            else if(Character.isLowerCase(sb.charAt(i)))
            {
                int temp1 = (int) sb.charAt(i);
                temp1-= 32;
                char ch =(char)temp1;
                sb.setCharAt(i, ch);
            }
        }
        //2-> Reverse
        int l=0, r = sb.length()-1;
        while( l<r)
        {
            char temp = sb.charAt(l);
            sb.setCharAt(l, sb.charAt(r));
            sb.setCharAt(r, temp);
            
            l++;
            r--;
        }
        
        
        //3-> space replaced with star
        for( int i=0; i<sb.length(); i++)
        {
            char ch = ' ';
            if( sb.charAt(i) == ch )
            {
                sb.setCharAt(i, '*');
            }
        }
        
        StringBuilder ans = new StringBuilder();
        //4 -> replace even position with their ASCII code
        
        for( int i=0; i<sb.length(); i++)
        {
            int temp= sb.charAt(i);
            if( i %2 != 0)
            {
                ans.append(temp);
            }
            else
            ans.append(sb.charAt(i));
        }
        ans.append(3);
        return ans.toString();
    }

    static String deciphering(String code)
    {
        StringBuilder sb = new StringBuilder(code);
        sb.setLength(sb.length() - 1);
        StringBuilder sb1=new StringBuilder();

        int value=0;

        for( int i=0; i<sb.length(); i++)
        {
            char ch=sb.charAt(i);
            int num = ch - '0';

            if( 0<= num && num <10 )
            {
                while(i<sb.length() && (int) (sb.charAt(i) -'0') >= 0 && (int) (sb.charAt(i) -'0')<10 )
                {
                    value = value *10;
                    value += (int) (sb.charAt(i) -'0');
                    i++;
                }
                i--;
                sb1.append((char)value);
                value =0;
                continue;
            }
            sb1.append(ch);

        }

        for( int i=0; i<sb1.length(); i++)
        {
            char ch= ' ';
            if( sb1.charAt(i) == '*')
            {
                sb1.setCharAt(i, ch);
            }
        }

        int l=0, r = sb1.length()-1;
        while( l<r)
        {
            char temp = sb1.charAt(l);
            sb1.setCharAt(l, sb1.charAt(r));
            sb1.setCharAt(r, temp);
            
            l++;
            r--;
        }

        for( int i=0; i<sb1.length(); i++ )
        {
            if( Character.isUpperCase(sb1.charAt(i)))
            {
                int temp1 = (int) sb1.charAt(i);
                temp1+= 32;
                char ch =(char)temp1;
                sb1.setCharAt(i, ch);
            }
            else if(Character.isLowerCase(sb1.charAt(i)))
            {
                int temp1 = (int) sb1.charAt(i);
                temp1-= 32;
                char ch =(char)temp1;
                sb1.setCharAt(i, ch);
            }
        }


        return sb1.toString();
    }
    public static void main(String args[])
    {  
        System.out.println(deciphering(ciphering("Welcome to hackerrank")));
        System.out.println(deciphering("?85O89*69R65*87O104*33I1043"));
    }
}