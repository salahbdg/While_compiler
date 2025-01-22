package TAC;

import java.util.List;

public class FuncCall implements NoeudAST {
    private String functionName; 
    private List<N_Expression> arguments; 

    public FuncCall(String functionName, List<N_Expression> arguments) {
        this.functionName = functionName;
        this.arguments = arguments;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public List<N_Expression> getArguments() {
        return arguments;
    }

    public void setArguments(List<N_Expression> arguments) {
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("call ").append(functionName);
        if (arguments != null && !arguments.isEmpty()) {
            sb.append(" (");
            for (int i = 0; i < arguments.size(); i++) {
                sb.append(arguments.get(i));
                if (i < arguments.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }
}
