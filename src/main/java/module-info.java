module com.example.designjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.designjavafx to javafx.fxml;
    exports com.example.designjavafx;
    exports es.ieslosmontecillos.di_t1a1_shanshangfeng;
    opens es.ieslosmontecillos.di_t1a1_shanshangfeng to javafx.fxml;
}