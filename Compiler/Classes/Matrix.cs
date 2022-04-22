using System.Collections.Generic;
namespace Compiler.Classes
{
    public class Matrix{
        public string Id { get; set; }
        public int Row {get; set; }
        public int Column {get; set; }
        
        public Matrix(string type,string id, int row, int column ){
            Row = row; 
            Column = column; 
            Id = id;
            
        }

        
    }
}
