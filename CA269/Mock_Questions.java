

class Q1a {

    String fieldName;
    int filedNumber;
    int fieldMarks;

    Q1a(String fieldName, int filedNumber, int fieldMarks) {
        this.fieldName = fieldName;
        this.filedNumber = filedNumber;
        this.fieldMarks = fieldMarks;
    }

    public String toString() {
        return this.filedNumber + " " + this.fieldName + " (" + this.fieldMarks + " marks)";
    }
}

class Q1b {
    private String fieldName;
    int fieldNumber;
    private int fieldMarks;

    Q1b () {
        this.fieldName = "untitled";
        this.fieldNumber = 0;
        this.fieldMarks = 0;
    }

    public String getFieldName() {
        return this.fieldName;
    }
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public int getFieldNumber() {
        return this.fieldNumber;
    }
    public void setFieldNumber(int fieldNumber) {
        this.fieldNumber = fieldNumber;
    }

    public int getFieldMarks() {
        return this.fieldMarks;
    }
    public void setFieldMarks(int fieldMarks) {
        if (this.fieldMarks > 0) {
            this.fieldMarks = fieldMarks;
        }
        else {
            this.fieldMarks = 0;
        }
    }

}

class Q1c {

    
}