class SQL {
    HashMap<String, table> sqlTables = new HashMap<String, table>();

    public SQL(List<String> names, List<Integer> columns) {
        sqlTables = new HashMap<>();
        for (int i = 0; i < names.size(); i++) {
            sqlTables.put(names.get(i), new table(columns.get(i)));
        }
    }

    public void insertRow(String name, List<String> row) {
        sqlTables.get(name).insert(row);
    }

    public void deleteRow(String name, int rowId) {
    }

    public String selectCell(String name, int rowId, int columnId) {
        return sqlTables.get(name).getCell(rowId, columnId);
    }
}

/**
 * Your SQL object will be instantiated and called as such:
 * SQL obj = new SQL(names, columns);
 * obj.insertRow(name,row);
 * obj.deleteRow(name,rowId);
 * String param_3 = obj.selectCell(name,rowId,columnId);
 */

class table {
    int id = 0;
    // List<Integer> columns;
    Map<Integer, List<String>> rows = new HashMap<Integer, List<String>>();

    public table(int columns) {
        rows = new HashMap<>();
    }

    public void insert(List<String> row) {
        rows.put(++id, row);
    }

    public void delete(int rowId) {
        rows.remove(rowId);
    }

    public String getCell(int rowId, int columnId) {
        return rows.get(rowId).get(columnId - 1);
    }
}
