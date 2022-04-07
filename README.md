# Image-Encryption-and-Decryption-using-Java
>![86a3ddc80ddaed757b665af757801981](https://user-images.githubusercontent.com/93794214/162174872-d59cdf91-7460-45de-a3cb-e8269d01b18a.gif)

Encryption is the process of converting information or data into a secrete code, especially to prevent unauthorized access. In these cases also we will do the same, For encryption, we will convert the image into a byte array and after converting it we will apply XOR operation on each value of the byte array and after performing XOR operation on each and every value of byte array will be changed. After performing the operation now we will write new data in Image due to which we are unable to open the Encrypted Image. Here are key will act as a password to Encrypt and Decrypt the Image.
>As we know that how to perform XOR operations now we will see how XOR operation will work here. Let’s consider an example of sample input and output.

Input:

int key = 8 
int byte_val = 5
Operation:

// Performing XOR operation between key and byte_val 
key ^ byte_val         
Output:

// Output of XOR operation 
13              
Operation:

// Performing XOR operation between output and key
13 ^ key                
Output:
//  byte_val
5      

> ## Example:

![EncryptandDecryptImageusingJava](https://user-images.githubusercontent.com/93794214/162173683-b182b38f-db4e-4499-8d69-854320c48968.png)

> ## Project screenshot:
> ![Screenshot 2022-04-07 151726](https://user-images.githubusercontent.com/93794214/162173952-bb80812d-f401-4a81-a48c-2b5e4d4feefc.jpg)
>
> ![Screenshot 2022-04-07 151906](https://user-images.githubusercontent.com/93794214/162173970-a01601cc-27e9-4373-9601-3201ada844fe.jpg)
