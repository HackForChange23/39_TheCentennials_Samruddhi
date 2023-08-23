package app.agro.samruddhi.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.agro.samruddhi.R


@Composable
fun Mitti() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                MaterialTheme.colorScheme.onPrimary
            )
    ) {
        Row(modifier = Modifier.padding(start = 30.dp, top = 30.dp)) {
            Text(
                text = "Mitti-ke-Man",
                fontSize = 25.sp,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.surfaceTint
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        MittiCard(image = R.drawable.cotton, text = "Cotton" , text2 = "Fertilizers Calculator")
        Divider(color = Color.Black, modifier = Modifier
            .fillMaxWidth()
            .width(2.dp))
        Spacer(modifier = Modifier.height(10.dp))
        MittiCard(image = R.drawable.maize, text = "Maize" , text2 = "Fertilizers Calculator")
        Divider(color = Color.Black, modifier = Modifier
            .fillMaxWidth()
            .width(2.dp))

        Row(modifier = Modifier.fillMaxWidth().padding(top = 15.dp) ) {

            Card(modifier = Modifier.padding(start = 300.dp)
            ) {
                Icon(
                    imageVector = Icons.Filled.Add,
                    contentDescription = "",
                    modifier = Modifier
                        .padding(top =3.dp, bottom = 3.dp , start = 4.dp, end = 4.dp)
                        .size(40.dp)
                )
            }
        }

    }
}



@Composable
fun MittiCard(image: Int, text: String,text2:String) {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {


        Card(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp))
                .padding(start = 15.dp, top = 20.dp, end = 15.dp, bottom = 10.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.secondaryContainer,
            ),

            elevation = CardDefaults.cardElevation(10.dp)
        ) {
            Row(modifier = Modifier.padding(start = 140.dp, top = 40.dp)) {


                Card(modifier = Modifier.clip(CircleShape)) {

                    Image(
                        painter = painterResource(image),
                        contentDescription = null,
                        modifier = Modifier.clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )

                }
            }
            Text(
                text = text,
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(start = 130.dp),
                color = MaterialTheme.colorScheme.surfaceTint,
                softWrap = true
            )
            Row(modifier = Modifier.padding(20.dp)) {
                Card(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = text2,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(start = 65.dp, top = 10.dp, bottom = 10.dp),
                        color = MaterialTheme.colorScheme.surfaceTint,
                        softWrap = true
                    )
                }
            }
        }


    }
}