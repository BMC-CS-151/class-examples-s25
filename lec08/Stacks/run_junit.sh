#How to run this: bash run_junit.sh TestFilename
javac -cp .:junit-4.13.2.jar $1.java
java -cp junit-4.13.2.jar:hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore $1 
