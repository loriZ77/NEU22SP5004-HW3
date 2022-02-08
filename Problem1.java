/**
 * Problem 1 [30pts]. According to historians, Julius Caesar used the following encryption
 * technique for sending messages. Given a string s and an integer k, replace every letter by
 * the letter than comes k positions later in alphabetical order. For example the string “hello”
 * with key 5, is encrypted into “mjqqt” since letter ‘m’ is the fifth letter after ‘h’ and so on.
 * Note that ‘z’ in this case is mapped to ‘e’ (since after ’z’ we go back to ’a’). To decrypt the
 * message one needs to know the key; for our example, just “shift” each letter by -5 positions.
 * In this problem you will write a program called Cipher.java which does both encryption
 * and decryption. Some examples follow
 * -- Enter the text below
 * Hello
 * -- Enter E for Encryption, D for Decryption, X to exit: E
 * -- Enter key: 5
 * -- The encrypted text is below
 * Mjqqt
 * Now another example
 * -- Enter the text below
 * Mjqqt
 * -- Enter E for Encryption, D for Decryption, X to exit: D
 * -- Enter key: 5
 * -- The decrypted text is below
 * Hello
 * Another example
 * -- Enter the text below
 * Hello
 * -- Enter E for Encryption, D for Decryption, X to exit: F
 * -- Input not recognized. Try again.
 * -- Enter E for Encryption, D for Decryption, X to exit: X
 * NOTE: You can assume that the input contain only alphabet letters, both lower case and
 * upper case, space, and the usual punctuation marks {., !?}. Non alphabet characters are to
 * be left unchanged. Also, you must keep the case; i.e. a lower case letter should be mapped
 * to a lower case letter.
 * NOTE: The key k is a positive integer. But, it can be a large number. In this case, you
 * must wrap it around. For example if the key is 27 then ’a’ is mapped to ’b’ etc. Your code is
 * expected to work with any non-negative integer. Please check that input key is valid (that
 * is key ≥ 0; if not print an error message and exit).
 */

public class Problem1 {
  // start your code here
}
