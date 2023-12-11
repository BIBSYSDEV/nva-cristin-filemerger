package no.sikt.excel.converter;

import java.nio.file.Path;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcelConverterTest {

    private Path SIMPLE_EXCELFILE = Path.of("");
    private ExcelConverter excelConverter;

    @BeforeEach
    void init () {
        excelConverter = new ExcelConverter(SIMPLE_EXCELFILE);
    }

    @Test
    void shouldThrowExceptionIfUnknownColumnNameExists() {

    }

    @Test
    void shouldThrowExceptionIfDuplicateFileIsListedMoreThanOnce() {

    }

    @Test
    void shouldThrowExceptionIfRowDoesNotHaveMandatoryFieldsFilled() {

    }

    @Test
    void shouldThrowExceptionIfContentFileNotFound() {

    }

    @Test
    void shouldThrowExceptionWhenExcelPathIsInvalid() {

    }

    @Test
    void shouldSetPublicationContextToCristin () {

    }

    @Test
    void shouldAssignRandomUUIDAsContentId() {

    }

    @Test
    void shouldAssignAcceptedVersion() {

    }

    @Test
    void shouldAssignPublishedVersion() {

    }

    @Test
    void shouldSetLicenseToValidURI() {

    }

    @Test
    void shouldParseEmbargoDate() {

    }

    @Test
    void shouldParseEmbargoDateForMultipleFilesForSameCristinPost () {
        
    }
 }
