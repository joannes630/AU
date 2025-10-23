CYB 2810 - Grep Exercises

To remove ^M (Dos to Unix)
sed -i 's/\r$//' filename.txt

Instructions for students:
1. cd to home dir; cd
2. create scripts folder; mkdir scripts/
3. Download the zip file from Brightspace to scripts folder (script_ex1.zip)
4. Unzip the zip file; unzip script_ex1.zip
5. Use grep with regex to find likely vulnerabilities. Example commands:
   grep -R "password" ./
   grep -R "Runtime.getRuntime" ./
   grep -R "System.out" ./
   grep -R "FileInputStream" ./
   grep -R "MD5" ./
   grep -R "Random" ./
   grep -R "SELECT .* FROM" ./
6. For each match, answer:
   - Which file and line is the issue on?
   - Why is it insecure?

sed -i 's/\r$//' filename
shopt -s globstar
id=`ps -eo pid,comm,%cpu --sort=-%cpu | grep consume_cpu | awk '{print $1}'`; kill -9 "$id"
