public class sem2_work1 {
    public static void main(String[] args) {
        String data = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        String[] parts = data.replaceAll("[{}\"]", "").split(",");
        StringBuilder query = new StringBuilder("SELECT * FROM students WHERE ");

        for (String part : parts) {
            String[] keyValue = part.split(":");
            String key = keyValue[0].trim();
            String value = keyValue[1].trim();

            if (!value.equals("null")) {
                query.append(key).append(" = ").append("\"").append(value).append("\"").append(" AND ");
            }
        }

        query.delete(query.length() - 5, query.length());
        System.out.println(query.toString());
    }
}