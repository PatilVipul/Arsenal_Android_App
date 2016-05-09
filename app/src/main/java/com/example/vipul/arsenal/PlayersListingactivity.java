package com.example.vipul.arsenal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class PlayersListingactivity extends ActionBarActivity
{
    ListView players_ListView;
    String [] playersName = {"Alexis Sanchez","Jack Wilshere","Santi Cazorla","Mesut Ozil","Aaron Ramsey","Arsene Wenger"};
    Integer [] imageId = {R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5,R.drawable.image6};
    Integer [] playerLargeImage = {R.drawable.alexissanchez,R.drawable.jackwilshere,R.drawable.santicazorla,R.drawable.mesutozil,R.drawable.aaronramsey,R.drawable.arsenewenger};
    String [] playerDescription = {"Chile international striker Alexis joined Arsenal in July 2014. " +
            "The exciting forward signed from Barcelona, where he made a total of 88 appearances and scored 39 goals during his three seasons with the Catalan side." +
            "With Barcelona, Sanchez won both La Liga (2012/13) and the Copa del Rey (2012), as well as the Spanish Super Cup on two occasions (2011, 2013), the Uefa Super Cup (2011) and the Fifa Club World Cup (2011).\n" +
            "Regarded as one of the world’s finest talents, Sanchez played a starring role at the 2014 World Cup in Brazil, where Chile qualifyied from their group (which included the Netherlands, Spain and Australia) and reaching the round of 16. During the tournament, Sanchez scored two goals from his four appearances.\n" +
            "The striker started his career with Cobreloa, based in Calama in north Chile, where he spent a season before moving to Santiago-based Colo-Colo, where he won the Chilean Primera Division in 2007." +
            "After convincing performances in Chile between 2005 and 2007, Sanchez went on loan to Argentine side River Plate, where he added the Argentinian Primera Division to his honours.", "Jack produced a host of impressive performances last season before suffering an ankle injury on international duty in March, which kept him out until the final two games of the campaign. Playing in his preferred position as a central midfielder, Jack showed a marked improvement in front of goal with five goals, including an outstanding team strike against Norwich City that was voted Goal of the Season. Another high point was his brace in Arsenal's 2-0 win at home to Marseille in the Champions League.\n" +
            "One of the most exciting English talents of his generation, he has been with Arsenal since the age of nine and won the FA Youth Cup in 2009. After a loan spell with Bolton in 2009/10 he returned to the club and was named the PFA Young Player of the Season in 2010/11. He holds the distinction of being the Gunners’ youngest-ever league player (16 years 256 days) and the youngest to represent Arsenal in Europe (16 years 329 days)." +
            "An important member of the England national team since 2010, he signed a new long-term contract with Arsenal in December 2012.", "Santi continued to impress during his second campaign at Arsenal. Despite some early-season injury problems, the Spaniard was a mainstay in the team, starting 41 games and scoring seven goals. He showed his versatility by regularly interchanging positions across Arsenal's midfield and attack, while combining well with Aaron Ramsey and Mesut Ozil.\n" +
            "Santi opened his account for the season with an excellent strike against Liverpool before scoring four goals in January. He produced his best moment in an Arsenal shirt in the FA Cup final against Hull City with a stunning free-kick to haul the Gunners back into the game." +
            "Signed from Malaga in August 2012, the technically-gifted playmaker slotted seamlessly into Premier League life - and proceeded to play more games than any other squad member during the 2013/13 campaign, including all 38 league matches.\n" +
            "Before joining Malaga in 2011, Santi spent two successful spells at Villarreal, making 181 appearances and helping them to second place in La Liga in 2008. In between those two spells he was named Spanish Player of the Year in 2007 while with Recreativo de Huelva.\n" +
            "He is a regular in the Spain set-up and was a member of their victorious Euro 2008 and Euro 2012 squads. He also featured in Spain’s run to the 2013 Confederations Cup final and was named in their squad for the 2014 World Cup.", "Mesut made an immediate impression in English football with a string of sparkling performances during his first season with the club. After becoming the club's record signing, he set up Olivier Giroud on his debut at Sunderland before scoring a sublime goal in the 2-0 win against Napoli. He went on to register a brace against Norwich City, plus further strikes at home to Hull and Everton before the turn of the year.\n" +
            "The Germany international suffered a hamstring injury against Bayern Munich in March, which kept him out for more than a month. But he made a positive impact on his return, scoring and setting up another in the 3-0 win against Newcastle." +
            "Widely regarded as one of the world’s finest midfielders, Ozil spent three years at Real Madrid, making 159 appearances and scoring 27 goals. While at the Bernabeu, he won the league title in 2012 and was a runner-up twice - also picking up a Copa del Rey winner’s medal in 2011.\n" +
            "A creative force blessed with good acceleration and an eye for a killer pass, Mesut has made more assists than any other player in Europe’s top five leagues during the last half-decade.\n" +
            "A full Germany international with a scoring record of almost one in three, he made his debut, aged 20, against Norway in 2009. Mesut, who is of Turkish descent, then starred at the 2010 World Cup and was among the nominees for the Golden Ball award. Two years later he was named in the Euro 2012 Team of the Tournament, after helping Germany to the semi finals. He also was a member of Germany’s squad at the 2014 World Cup.", "Last term will live long in the memory of Player of the Season Aaron Ramsey. The Welshman scored 16 goals in 34 appearances, including a dramatic winner in the FA Cup final to seal a stunning personal campaign.\n" +
            "After an impressive pre-season, Aaron got off to a flyer with eight goals in his first nine games as Arsenal quickly moved to the summit of the Premier League. Crucial goals against Liverpool and Borussia Dortmund followed and the Welshman also netted a brace against former club Cardiff City at the end of November. A thigh injury suffered on Boxing Day kept him out for just under four months but his spell on the sidelines had no bearing on his outstanding form." +
            "The midfielder netted a further three goals after his return to take his tally to 16 for the season, which ended with a richly-deserved FA Cup winner’s medal.\n" +
            "Aaron joined the Gunners from Cardiff City in the summer of 2008, aged just 17. He had already become the Bluebirds’ youngest player (at 16 years 124 days), and was the fifth-youngest scorer in Champions League history when he netted for Arsenal against Fenerbahce in October of that year.\n" +
            "His progress received a setback when he sustained a serious leg fracture in February 2010, necessitating a long road to recovery that took in loans at Nottingham Forest and back at Cardiff. His rehabilitation was successful, and he is now a key player for club and country.\n" +
            "He has captained Wales, and represented Team GB in the 2012 Olympics - scoring as they reached the quarter-finals.", "Arsène continues to set records as the club’s longest-serving manager - this is his 18th season of a hugely successful era at the helm.\n" +
            "The Frenchman took the reins on October 1, 1996, and since then has presided over more victories, posted a higher win ratio and brought home more trophies than any of his predecessors." +
            "Last season, he passed the 1000-game mark in the Gunners’ dugout, and led Arsenal to a record-equalling 11th FA Cup win. \n" +
            "His first silverware with the club came in the form of a domestic ‘double’ in 1997/98, a feat matched in 2001/02. Memorably, he then guided the team to a remarkable unbeaten league title - the only one achieved in the modern era - in 2003/04. On top of this, there have been two more FA Cup wins during his reign and a Champions League final appearance in 2006.\n" +
            "Renowned as a true footballing innovator both stylistically and behind the scenes - to the latter end, he played a big part in the conception and design of Emirates Stadium and the Training Ground - Arsène has stamped his own brand of attacking football on the club, one that is now acknowledged worldwide as being synonymous with the Gunners’ name.\n" +
            "He is also well known for his development of young players, and his commitment towards preparing them for football careers in the best way possible.\n" +
            "An economics graduate from Strasbourg University, multilingual Arsène has also received an honorary DSc from the University of Hertfordshire - as well as the French Legion D’Honneur, an honorary OBE in this country and the Freedom of the Borough of Islington. "};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players_listingactivity);
        CustomList playersAdapter = new CustomList(PlayersListingactivity.this,playersName,imageId);
        players_ListView = (ListView) findViewById(R.id.playersList);
        players_ListView.setAdapter(playersAdapter);
        players_ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==5)
                {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(PlayersListingactivity.this);

                    alertDialogBuilder.setTitle("Decision");
                    alertDialogBuilder.setMessage("Arsene Wenger is the Boss, still continue?");

                    alertDialogBuilder.setPositiveButton("OK",new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,int id) {
                            Intent playerIntent = new Intent(PlayersListingactivity.this, PlayerDetailActivity.class);
                            Bundle playerBundle = new Bundle();
                            playerBundle.putString("value1",playersName[5]);
                            playerBundle.putInt("value2",playerLargeImage[5]);
                            playerBundle.putString("value3",playerDescription[5]);
                            playerIntent.putExtras(playerBundle);
                            startActivity(playerIntent);
                        }
                    });

                    alertDialogBuilder.setNegativeButton("Cancel",new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,int id) {
                            dialog.cancel();
                        }
                    });

                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();
                }

                else
                {
                    Intent playerIntent = new Intent(PlayersListingactivity.this, PlayerDetailActivity.class);
                    Bundle playerBundle = new Bundle();
                    playerBundle.putString("value1",playersName[position]);
                    playerBundle.putInt("value2",playerLargeImage[position]);
                    playerBundle.putString("value3",playerDescription[position]);
                    playerIntent.putExtras(playerBundle);
                    startActivity(playerIntent);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_players_listingactivity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        if (id == R.id.info)
        {
            Intent intent = new Intent(this, ArsenalInfoActivity.class);
            startActivity(intent);
        }
        else if(id==R.id.uninstall)
        {
            Intent uninstallIntent = new Intent(Intent.ACTION_DELETE);
            uninstallIntent.setData(Uri.parse("package:" + "com.example.vipul.arsenal"));
            startActivity(uninstallIntent);
        }
        return super.onOptionsItemSelected(item);
    }
}