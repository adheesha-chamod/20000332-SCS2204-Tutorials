import scala.io.StdIn.readLine;
import scala.io.StdIn.readInt;

object caesar_cipher{
    /* definition of the alphabet */
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


    /* This allows to take negative(not for all), bigger than or alphabet size numbers */
    def shift(n: Int): Int = {
        (n + alphabet.size) % alphabet.size;
    }


    /* encrypt the passed msg and return it */
    def encrypt(msg: String, shift: Int): String = {
        msg.map((c: Char) => {
            var t: Int = alphabet.indexOf(c.toUpper);
            
            /* If the char c is in the alphabet then encrypt it, otherwise leave it */
            if(t == -1){
                c;
            }else{
                alphabet((t + shift) % alphabet.size);
            }
        });
    }


    /* decrypt the passed msg and return it */
    def decrypt(msg: String, shift: Int): String = {
        msg.map((c: Char) => {
            var t: Int = alphabet.indexOf(c.toUpper);
            
            /* If the char c is in the alphabet then decrypt it, otherwise leave it */
            if(t == -1){
                c;
            }else{
                alphabet((t - shift + alphabet.size) % alphabet.size);
            }
        });
    }


    def cipher(func: String, msg: String, shift: Int): String = {
        func match{
            case "encrypt" => encrypt(msg, shift);
            case "decrypt" => decrypt(msg, shift);
        }
    }


    def main(args: Array[String]): Unit = {
        printf("Shift by: ");
        var n: Int = readInt();     // shift the plaintext by n

        var s = shift(n);

        printf("Enter secret message: ");
        var msg: String = readLine();   // read the secret message from the keyboard

        var encryptMsg: String = cipher("encrypt", msg, s);
        printf("Encrypted message: %s\n", encryptMsg);  // print the encrypted message

        var decryptMsg: String = cipher("decrypt", encryptMsg, s);
        printf("Decrypted message: %s\n", decryptMsg);  // print the decrypted message
    }
}