package utilidades;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

    int dia;
    int mes;
    int anno;
    static int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public Fecha()
    {
        Calendar c=new GregorianCalendar();
        dia= c.get(Calendar.DATE);
        mes=c.get(Calendar.MONTH)+1;
        anno=c.get(Calendar.YEAR);
    }

    public boolean comprobarFechaAnno(String fecha) {
        String[] resultado;
        resultado = fecha.split("/");
        boolean correcto = true;

        if (resultado.length != 3) {// xq tiene que tener 3 espacios(dias, mes y año)
            correcto = false;
        } else {
            try {
                dia = Integer.parseInt(resultado[2]);
                mes = Integer.parseInt(resultado[1]);
                anno = Integer.parseInt(resultado[0]);
                if (mes < 1 || mes > 12) {
                    correcto = false;
                } else if (dia < 1 || dia > diasMes[mes - 1])//-1 xq empieza a contar desde 0 Enero=0
                {
                    correcto = false;
                }

            } catch (NumberFormatException ex) {
                correcto = false;
            } catch (Exception ex) {
                correcto = false;
            }
        }
        return correcto;
    }

    public boolean comprobarFechaMenor(Fecha miFecha) {
        boolean correcto = false;
        if ((anno < miFecha.anno) || (anno == miFecha.anno && mes < miFecha.mes)
                || (anno == miFecha.anno && mes == miFecha.mes && dia < miFecha.dia)) {
            correcto = true;
        }
        return correcto;
    }

    public int compararFechas(Fecha miFecha) {
        int resultado;
        if ((anno < miFecha.anno) || (anno == miFecha.anno && mes < miFecha.mes)
                || (anno == miFecha.anno && mes == miFecha.mes && dia < miFecha.dia)) {
            resultado = -1;
        } else {
            if ((anno > miFecha.anno) || (anno == miFecha.anno && mes > miFecha.mes)
                    || (anno == miFecha.anno && mes == miFecha.mes && dia > miFecha.dia)) {
                resultado = 1;
            } else {
                resultado = 0;
            }
        }
        return resultado;
    }
}
