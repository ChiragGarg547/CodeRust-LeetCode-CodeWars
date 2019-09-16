/*
https://www.codewars.com/kata/caeser-encryption/train/python

A Caeser cipher shifts the letters in a message by the value dictated by the encryption key. Since Caeser's emails are very important, he wants all encryptions to have upper-case output, for example:

If key = 3 "hello" -> KHOOR If key = 7 "hello" -> OLSSV

Input will consist of the message to be encrypted and the encryption key.

 */

package CaesarEncryption;

public class CaesarEncryption
{
    public static void main(String[] args)
    {
        System.out.println(encryptThis("abc", 1));
    }

    public static String encryptThis(String message, int key)
    {
        String secret = "";
        if (message.length() == 0)
        {
            return "String length = 0";
        }

        for (int i = 0; i < message.length(); i++)
        {
            char currentChar = message.charAt(i);
            if (currentChar + key > 'z')
            {
                int difference = 'z' - currentChar;
            }
            currentChar += key;
            secret += currentChar;
        }

        return secret;
    }
}
