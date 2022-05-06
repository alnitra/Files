import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {

        StringBuilder logSB = new StringBuilder();
        // определяем объект для каталога
        File dirSrc = new File("Games/src");
        File dirRes = new File("Games/res");
        File dirSave = new File("Games/savegames");
        File dirTemp = new File("Games/temp");

        // пробуем создать каталог
        logSB.append(dirSrc.mkdir()?new Date().toString() + "; Каталог " + dirSrc.getName() + " создан;\n":
                new Date().toString() + "; Ошибка создания каталога " + dirSrc.getName() + ";\n");
        logSB.append(dirRes.mkdir()?new Date().toString() + "; Каталог " + dirRes.getName() + " создан;\n":
                new Date().toString() + "; Ошибка создания каталога " + dirRes.getName() + ";\n");
        logSB.append(dirSave.mkdir()?new Date().toString() + "; Каталог " + dirSave.getName() + " создан;\n":
                new Date().toString() + "; Ошибка создания каталога " + dirSave.getName() + ";\n");
        logSB.append(dirTemp.mkdir()?new Date().toString() + "; Каталог " + dirTemp.getName() + " создан;\n":
                new Date().toString() + "; Ошибка создания каталога " + dirTemp.getName() + ";\n");
        File dirSrcMain = new File(dirSrc.getAbsolutePath() + "/main");
        File dirSrcTest = new File(dirSrc.getAbsolutePath() + "/test");
        logSB.append(dirSrcMain.mkdir()?new Date().toString() + "; Каталог " + dirSrcMain.getName() + " создан;\n":
                new Date().toString() + "; Ошибка создания каталога " + dirSrcMain.getName() + ";\n");
        logSB.append(dirSrcTest.mkdir()?new Date().toString() + "; Каталог " + dirSrcTest.getName() + " создан;\n":
                new Date().toString() + "; Ошибка создания каталога " + dirSrcTest.getName() + ";\n");
        File dirResDrawables = new File(dirRes.getAbsolutePath() + "/drawables");
        File dirResVectors = new File(dirRes.getAbsolutePath() + "/vectors");
        File dirResIcons = new File(dirRes.getAbsolutePath() + "/icons");
        logSB.append(dirResDrawables.mkdir()?new Date().toString() + "; Каталог " + dirResDrawables.getName() + " создан;\n":
                new Date().toString() + "; Ошибка создания каталога " + dirResDrawables.getName() + ";\n");
        logSB.append(dirResVectors.mkdir()?new Date().toString() + "; Каталог " + dirResVectors.getName() + " создан;\n":
                new Date().toString() + "; Ошибка создания каталога " + dirResVectors.getName() + ";\n");
        logSB.append(dirResIcons.mkdir()?new Date().toString() + "; Каталог " + dirResIcons.getName() + " создан;\n":
                new Date().toString() + "; Ошибка создания каталога " + dirResIcons.getName() + ";\n");
        // определяем объект для файла
        File fileMain = new File(dirSrcMain.getAbsolutePath() + "/Main.java");
        File fileUtils = new File(dirSrcMain.getAbsolutePath() + "/Utils.java");
        // создадим новый файл
        try {
            if (fileMain.createNewFile())
                logSB.append(new Date().toString() + "; Файл " + fileMain.getName() + " был создан;\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            if (fileUtils.createNewFile())
                logSB.append(new Date().toString() + "; Файл " + fileUtils.getName() + " был создан;\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        File fileTemp = new File(dirTemp.getAbsolutePath() + "/temp.txt");
        try {
            if (fileTemp.createNewFile())
                logSB.append(new Date().toString() + "; Файл " + fileTemp.getName() + " был создан;\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
//        System.out.println(logSB.toString());

        try (FileWriter fW = new FileWriter(fileTemp)) {
        // запись всей строки
            fW.write(logSB.toString());
        // дозаписываем и очищаем буфер
            fW.flush();
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }

//        System.out.println(dirSrc.getAbsolutePath());

    }
}
