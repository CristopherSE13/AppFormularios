package pe.edu.idat.appformularios.comunes

import android.view.View
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import pe.edu.idat.appformularios.R

object AppMensaje {
    // creando metodos
    fun enviarmensaje(vista:View, mensaje: String, tipoMensaje: TipoMensaje){
        val snackBar = Snackbar.make(vista,mensaje,Snackbar.LENGTH_LONG)
        if(tipoMensaje == TipoMensaje.ERROR){
            snackBar.setBackgroundTint(
                ContextCompat.getColor(MiApp.instance,
                    R.color.errorcolor))
        }else{
            snackBar.setBackgroundTint(
                ContextCompat.getColor(MiApp.instance,
                    R.color.exitocolor))
        }
        snackBar.show()
    }




}