package app.agro.samruddhi.ui.theme



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.agro.samruddhi.R

@Composable
fun Picture() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                MaterialTheme.colorScheme.onPrimary
            )
    ) {
        Row(modifier = Modifier.padding(start = 10.dp, top = 30.dp)) {
            Text(
                text = "Take a Picture",
                fontSize = 25.sp,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.surfaceTint
            )
        }
        Row(modifier = Modifier.padding(start = 10.dp, top = 4.dp)) {
            Text(
                text = "Fit the crop image with the frame",
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.surfaceTint
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Image(painter = painterResource(id = R.drawable.picture), contentDescription ="" )

    }
    Box(modifier = Modifier){
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(start = 60.dp, end = 40.dp, top = 600.dp)){
            PictureIcon(image = R.drawable.picture1)
            PictureIcon(image = R.drawable.picture2)
            PictureIcon(image = R.drawable.picture3)


        }
    }
    Box(modifier = Modifier .padding(start = 60.dp, end = 40.dp, top = 250.dp)){

        Image(painter = painterResource(R.drawable.picturerec), contentDescription = "", modifier = Modifier.size(250.dp),
        )



    }

}

@Composable
fun PictureIcon(image:Int) {
    Image(painter = painterResource(image), contentDescription = "", modifier = Modifier.size(45.dp),
    )
    Spacer(modifier = Modifier.padding(end = 60.dp))
}




