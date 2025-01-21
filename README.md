# CREATE A COMPILER FOR WHILE LANGUAGE

To use our compiler, download WHILECOMPILER.jar and then run 

java -jar WHILECOMPILER.jar yourwhilefile.while -x 

If you want to debug make sur you create a directory named debugAST in the same working folder and run

java -jar WHILECOMPILER.jar yourwhilefile.while -d 

this will generate a .dot file that you can visualize the AST


## EXAMPLE CODE 
```code
function main : read X, Y %
    Z := (cons X Y);
    if Z then
        W := (hd Z)
    else
        W := nil
    fi;
    foreach A in Z do
        B := (hd A)
    od
%
write W
```


## Workflow

Here is a workflow of the work

![alt text](images&diagrams/image.png)


### Example

![alt text](images&diagrams/workflow.jpeg)