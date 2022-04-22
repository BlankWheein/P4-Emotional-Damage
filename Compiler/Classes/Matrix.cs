namespace Compiler.Classes
{
    public class Matrix{
        public string Id { get; set; }
        public int Row {get; set; }
        public int Column {get; set; }
        public Matrix(int row, int column, string id){
            Row = row; 
            Column = column; 
            Id = id;
        }
    }
}
