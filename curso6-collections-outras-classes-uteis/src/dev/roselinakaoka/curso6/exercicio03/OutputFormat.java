package dev.roselinakaoka.curso6.exercicio03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

public class OutputFormat {

    public static String mapParaJson(Map<String, Object> dados) {
        StringBuilder json = new StringBuilder();
        json.append("{\n");
        int count = 0;
        int size = dados.size();

        for (Map.Entry<String, Object> entry : dados.entrySet()) {
            json.append("  \"").append(entry.getKey()).append("\": ");
            Object valor = entry.getValue();

            if (valor instanceof String || valor instanceof LocalDate || valor instanceof LocalDateTime) {
                json.append("\"").append(valor.toString()).append("\"");
            } else {
                json.append(valor);
            }

            count++;

            if (count < size) json.append(",");
            json.append("\n");
        }
        json.append("}");
        return json.toString();
    }

    public static String mapParaXml(Map<String, Object> dados) {
        StringBuilder xml = new StringBuilder();
        xml.append("<dados>\n");
        for (Map.Entry<String, Object> entry : dados.entrySet()) {
            xml.append("  <").append(entry.getKey()).append(">");
            xml.append(entry.getValue().toString());
            xml.append("</").append(entry.getKey()).append(">\n");
        }
        xml.append("</dados>");
        return xml.toString();
    }

    public static String mapParaYaml(Map<String, Object> dados) {
        StringBuilder yaml = new StringBuilder();
        for (Map.Entry<String, Object> entry : dados.entrySet()) {
            yaml.append(entry.getKey()).append(": ");
            Object valor = entry.getValue();

            if (valor instanceof String || valor instanceof LocalDate || valor instanceof LocalDateTime) {
                yaml.append(valor.toString());
            } else {
                yaml.append(valor);
            }
            yaml.append("\n");
        }
        return yaml.toString();
    }


}
