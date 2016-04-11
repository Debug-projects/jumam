package br.com.jumam.edita;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class EntryViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField ddoBai;

    @FXML
    private TextField dteBai;

    @FXML
    private ChoiceBox<?> dteEC;

    @FXML
    private TextField acProf;

    @FXML
    private TextField acNome;

    @FXML
    private TextField ddoCEP;

    @FXML
    private TextField dteID;

    @FXML
    private TextField acNac;

    @FXML
    private TextField dteNac;

    @FXML
    private TextField dteCEP;

    @FXML
    private TextField dteUF;

    @FXML
    private Button btnSalvar;

    @FXML
    private TextField acCPF;

    @FXML
    private ChoiceBox<?> aaEC;

    @FXML
    private TextField ddoRG;

    @FXML
    private TextField aaNac;

    @FXML
    private TextField aaProf;

    @FXML
    private TextField dteNome;

    @FXML
    private TextField aaNome;

    @FXML
    private TextField aaCPF;

    @FXML
    private TextField dteCid;

    @FXML
    private CheckBox opCPF;

    @FXML
    private TextField ddoNat;

    @FXML
    private ChoiceBox<?> acEC;

    @FXML
    private TextField dteEnd;

    @FXML
    private TextField dteTel;

    @FXML
    private TextField dteCPF;

    @FXML
    private TextField ddoCPF;

    @FXML
    private CheckBox opCNPJ;

    @FXML
    private TextField ddoEnd;

    @FXML
    private TextField ddoTel;

    @FXML
    private TextField ddoNac;

    @FXML
    private TextField aaRG;

    @FXML
    private TextField dteNat;

    @FXML
    private TextField acRG;

    @FXML
    private DatePicker audDate;

    @FXML
    private TextField dteRG;

    @FXML
    private TextField ddoNome;

    @FXML
    private ComboBox<?> ddoEC;

    @FXML
    private TextField dteRep;

    @FXML
    private TextField ddoProf;

    @FXML
    void initialize() {
        assert ddoBai != null : "fx:id=\"ddoBai\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert dteBai != null : "fx:id=\"dteBai\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert dteEC != null : "fx:id=\"dteEC\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert acProf != null : "fx:id=\"acProf\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert acNome != null : "fx:id=\"acNome\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert ddoCEP != null : "fx:id=\"ddoCEP\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert dteID != null : "fx:id=\"dteID\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert acNac != null : "fx:id=\"acNac\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert dteNac != null : "fx:id=\"dteNac\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert dteCEP != null : "fx:id=\"dteCEP\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert dteUF != null : "fx:id=\"dteUF\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert btnSalvar != null : "fx:id=\"btnSalvar\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert acCPF != null : "fx:id=\"acCPF\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert aaEC != null : "fx:id=\"aaEC\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert ddoRG != null : "fx:id=\"ddoRG\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert aaNac != null : "fx:id=\"aaNac\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert aaProf != null : "fx:id=\"aaProf\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert dteNome != null : "fx:id=\"dteNome\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert aaNome != null : "fx:id=\"aaNome\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert aaCPF != null : "fx:id=\"aaCPF\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert dteCid != null : "fx:id=\"dteCid\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert opCPF != null : "fx:id=\"opCPF\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert ddoNat != null : "fx:id=\"ddoNat\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert acEC != null : "fx:id=\"acEC\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert dteEnd != null : "fx:id=\"dteEnd\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert dteTel != null : "fx:id=\"dteTel\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert dteCPF != null : "fx:id=\"dteCPF\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert ddoCPF != null : "fx:id=\"ddoCPF\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert opCNPJ != null : "fx:id=\"opCNPJ\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert ddoEnd != null : "fx:id=\"ddoEnd\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert ddoTel != null : "fx:id=\"ddoTel\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert ddoNac != null : "fx:id=\"ddoNac\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert aaRG != null : "fx:id=\"aaRG\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert dteNat != null : "fx:id=\"dteNat\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert acRG != null : "fx:id=\"acRG\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert audDate != null : "fx:id=\"audDate\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert dteRG != null : "fx:id=\"dteRG\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert ddoNome != null : "fx:id=\"ddoNome\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert ddoEC != null : "fx:id=\"ddoEC\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert dteRep != null : "fx:id=\"dteRep\" was not injected: check your FXML file 'EditaView.fxml'.";
        assert ddoProf != null : "fx:id=\"ddoProf\" was not injected: check your FXML file 'EditaView.fxml'.";

    }
}

