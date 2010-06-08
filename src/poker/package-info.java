/**
</head> 
<body onload="initialPopulate();"> 
 
<div id="main"> 
 
<div class="top-level" id="class_chart:RANDOM_GENERATOR"> 
  <table class="outer"> 
    <tr class="top"> 
      <th class="type">CLASS</th> 
      <td class="name" colspan="2">RANDOM_GENERATOR</td> 
      <td class="part"><strong>Part:</strong> 1/1</td> 
    </tr> 
    <tr class="middle"> 
      <td class="explanation" colspan="2"> 
        <dl> 
          <dt>Type Of Object</dt> 
          <dd>&quot;Mechanism which is responsible for creating random numbers.&quot;</dd> 
        </dl> 
      </td> 
      <td class="indexing" colspan="2"> 
        <dl> 
          <dt>Indexing</dt> 
          <dd>in_cluster : "UTILITIES";</dd> 
        </dl> 
      </td> 
    </tr> 
    <tr> 
      <td colspan="4" class="bottom"> 
        <table> 
          
          <tr> 
            <th class="light-grey">Queries</th> 
            <td class="white spaced-lines"></td> 
          </tr> 
          <tr> 
            <th class="light-grey">Commands</th> 
            <td class="white spaced-lines">&quot;Create random numbers.&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Constraints</th> 
            <td class="white spaced-lines"></td> 
          </tr> 
        </table> 
      </td> 
    </tr> 
  </table> 
</div> 
 
<div class="top-level" id="class_chart:LOG_HANDLING"> 
  <table class="outer"> 
    <tr class="top"> 
      <th class="type">CLASS</th> 
      <td class="name" colspan="2">LOG_HANDLING</td> 
      <td class="part"><strong>Part:</strong> 1/1</td> 
    </tr> 
    <tr class="middle"> 
      <td class="explanation" colspan="2"> 
        <dl> 
          <dt>Type Of Object</dt> 
          <dd>&quot;Global set of instructions for handling logs.&quot;</dd> 
        </dl> 
      </td> 
      <td class="indexing" colspan="2"> 
        <dl> 
          <dt>Indexing</dt> 
          <dd>in_cluster : "UTILITIES";</dd> 
        </dl> 
      </td> 
    </tr> 
    <tr> 
      <td colspan="4" class="bottom"> 
        <table> 
          
          <tr> 
            <th class="light-grey">Queries</th> 
            <td class="white spaced-lines"></td> 
          </tr> 
          <tr> 
            <th class="light-grey">Commands</th> 
            <td class="white spaced-lines">&quot;Write event.&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Constraints</th> 
            <td class="white spaced-lines"></td> 
          </tr> 
        </table> 
      </td> 
    </tr> 
  </table> 
</div> 
 
<div class="top-level" id="class_chart:TABLE"> 
  <table class="outer"> 
    <tr class="top"> 
      <th class="type">CLASS</th> 
      <td class="name" colspan="2">TABLE</td> 
      <td class="part"><strong>Part:</strong> 1/1</td> 
    </tr> 
    <tr class="middle"> 
      <td class="explanation" colspan="2"> 
        <dl> 
          <dt>Type Of Object</dt> 
          <dd>&quot;Represents a table.&quot;</dd> 
        </dl> 
      </td> 
      <td class="indexing" colspan="2"> 
        <dl> 
          <dt>Indexing</dt> 
          <dd>in_cluster : "POKER_TABLE";</dd> 
        </dl> 
      </td> 
    </tr> 
    <tr> 
      <td colspan="4" class="bottom"> 
        <table> 
          
          <tr> 
            <th class="light-grey">Queries</th> 
            <td class="white spaced-lines">&quot;What is size of the table?&quot;,<br/>&quot;How many players play?&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Commands</th> 
            <td class="white spaced-lines">&quot;Construct table.&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Constraints</th> 
            <td class="white spaced-lines">&quot;Size must be greater or equal than 2 and less or equal to 10&quot;</td> 
          </tr> 
        </table> 
      </td> 
    </tr> 
  </table> 
</div> 
 
<div class="top-level" id="class_chart:PLAYER"> 
  <table class="outer"> 
    <tr class="top"> 
      <th class="type">CLASS</th> 
      <td class="name" colspan="2">PLAYER</td> 
      <td class="part"><strong>Part:</strong> 1/1</td> 
    </tr> 
    <tr class="middle"> 
      <td class="explanation" colspan="2"> 
        <dl> 
          <dt>Type Of Object</dt> 
          <dd>&quot;Defines a player.&quot;</dd> 
        </dl> 
      </td> 
      <td class="indexing" colspan="2"> 
        <dl> 
          <dt>Indexing</dt> 
          <dd>in_cluster : "POKER_TABLE";</dd> 
        </dl> 
      </td> 
    </tr> 
    <tr> 
      <td colspan="4" class="bottom"> 
        <table> 
          
          <tr> 
            <th class="light-grey">Queries</th> 
            <td class="white spaced-lines">&quot;Who am I?&quot;,<br/>&quot;How much money do I have?&quot;,<br/>&quot;Am I active in current hand?&quot;,<br/>&quot;Where am I sitting?&quot;,<br/>&quot;My statistics?&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Commands</th> 
            <td class="white spaced-lines">&quot;Construct player.&quot;,<br/>&quot;Set Name.&quot;,<br/>&quot;Set bank amount.&quot;,<br/>&quot;Add value to bank amount&quot;,<br/>&quot;Subtract value from bank amount&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Constraints</th> 
            <td class="white spaced-lines">&quot;Values and bank amount must always be greater or equal to zero.&quot;</td> 
          </tr> 
        </table> 
      </td> 
    </tr> 
  </table> 
</div> 
 
<div class="top-level" id="class_chart:DEALER"> 
  <table class="outer"> 
    <tr class="top"> 
      <th class="type">CLASS</th> 
      <td class="name" colspan="2">DEALER</td> 
      <td class="part"><strong>Part:</strong> 1/1</td> 
    </tr> 
    <tr class="middle"> 
      <td class="explanation" colspan="2"> 
        <dl> 
          <dt>Type Of Object</dt> 
          <dd>&quot;Dealer is responsible for handling all the table actions.&quot;</dd> 
        </dl> 
      </td> 
      <td class="indexing" colspan="2"> 
        <dl> 
          <dt>Indexing</dt> 
          <dd>in_cluster : "POKER_TABLE";</dd> 
        </dl> 
      </td> 
    </tr> 
    <tr> 
      <td colspan="4" class="bottom"> 
        <table> 
          
          <tr> 
            <th class="light-grey">Queries</th> 
            <td class="white spaced-lines">&quot;Who is on the button?&quot;,<br/>&quot;What is the blind?&quot;,<br/>&quot;What is ante?&quot;,<br/>&quot;What is the pot?&quot;,<br/>&quot;Add bet to pot?&quot;,<br/>&quot;Decide winner?&quot;,<br/>&quot;What is the state of the game?&quot;,<br/>&quot;Is it valid bet?&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Commands</th> 
            <td class="white spaced-lines">&quot;Update game state.&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Constraints</th> 
            <td class="white spaced-lines">&quot;Only one dealer per table.&quot;</td> 
          </tr> 
        </table> 
      </td> 
    </tr> 
  </table> 
</div> 
 
<div class="top-level" id="class_chart:HISTORY"> 
  <table class="outer"> 
    <tr class="top"> 
      <th class="type">CLASS</th> 
      <td class="name" colspan="2">HISTORY</td> 
      <td class="part"><strong>Part:</strong> 1/1</td> 
    </tr> 
    <tr class="middle"> 
      <td class="explanation" colspan="2"> 
        <dl> 
          <dt>Type Of Object</dt> 
          <dd>&quot;Keeps history of every hand.&quot;</dd> 
        </dl> 
      </td> 
      <td class="indexing" colspan="2"> 
        <dl> 
          <dt>Indexing</dt> 
          <dd>in_cluster : "POKER_TABLE";</dd> 
        </dl> 
      </td> 
    </tr> 
    <tr> 
      <td colspan="4" class="bottom"> 
        <table> 
          
          <tr> 
            <th class="light-grey">Queries</th> 
            <td class="white spaced-lines">&quot;Is hand over?&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Commands</th> 
            <td class="white spaced-lines">&quot;Store hand.&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Constraints</th> 
            <td class="white spaced-lines">&quot;Hand need to be over in order to be stored.&quot;</td> 
          </tr> 
        </table> 
      </td> 
    </tr> 
  </table> 
</div> 
 
<div class="top-level" id="class_chart:SEAT"> 
  <table class="outer"> 
    <tr class="top"> 
      <th class="type">CLASS</th> 
      <td class="name" colspan="2">SEAT</td> 
      <td class="part"><strong>Part:</strong> 1/1</td> 
    </tr> 
    <tr class="middle"> 
      <td class="explanation" colspan="2"> 
        <dl> 
          <dt>Type Of Object</dt> 
          <dd>&quot;Each player have a specific seat in a table.&quot;</dd> 
        </dl> 
      </td> 
      <td class="indexing" colspan="2"> 
        <dl> 
          <dt>Indexing</dt> 
          <dd>in_cluster : "POKER_TABLE";</dd> 
        </dl> 
      </td> 
    </tr> 
    <tr> 
      <td colspan="4" class="bottom"> 
        <table> 
          
          <tr> 
            <th class="light-grey">Queries</th> 
            <td class="white spaced-lines">&quot;What is the seat position?&quot;,<br/>&quot;Who is sitting on that seat?&quot;,<br/>&quot;Is this seat available?&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Commands</th> 
            <td class="white spaced-lines">&quot;Construct seat.&quot;,<br/>&quot;Assign player to seat.&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Constraints</th> 
            <td class="white spaced-lines">&quot;One player per seat.&quot;</td> 
          </tr> 
        </table> 
      </td> 
    </tr> 
  </table> 
</div> 
 
<div class="top-level" id="class_chart:GAME_STATE"> 
  <table class="outer"> 
    <tr class="top"> 
      <th class="type">CLASS</th> 
      <td class="name" colspan="2">GAME_STATE</td> 
      <td class="part"><strong>Part:</strong> 1/1</td> 
    </tr> 
    <tr class="middle"> 
      <td class="explanation" colspan="2"> 
        <dl> 
          <dt>Type Of Object</dt> 
          <dd>&quot;Tracks down status of the game.&quot;</dd> 
        </dl> 
      </td> 
      <td class="indexing" colspan="2"> 
        <dl> 
          <dt>Indexing</dt> 
          <dd>in_cluster : "POKER_TABLE";</dd> 
        </dl> 
      </td> 
    </tr> 
    <tr> 
      <td colspan="4" class="bottom"> 
        <table> 
          
          <tr> 
            <th class="light-grey">Queries</th> 
            <td class="white spaced-lines">&quot;Whats the status? (Including who's turn is it)&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Commands</th> 
            <td class="white spaced-lines">&quot;Set last action.&quot;,<br/>&quot;Update game status.&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Constraints</th> 
            <td class="white spaced-lines">&quot;Needs to be unique (Singleton).&quot;</td> 
          </tr> 
        </table> 
      </td> 
    </tr> 
  </table> 
</div> 
 
<div class="top-level" id="class_chart:BUTTON"> 
  <table class="outer"> 
    <tr class="top"> 
      <th class="type">CLASS</th> 
      <td class="name" colspan="2">BUTTON</td> 
      <td class="part"><strong>Part:</strong> 1/1</td> 
    </tr> 
    <tr class="middle"> 
      <td class="explanation" colspan="2"> 
        <dl> 
          <dt>Type Of Object</dt> 
          <dd>&quot;A player will represent the dealer in each hand.&quot;</dd> 
        </dl> 
      </td> 
      <td class="indexing" colspan="2"> 
        <dl> 
          <dt>Indexing</dt> 
          <dd>in_cluster : "DEALER_ACTION";</dd> 
        </dl> 
      </td> 
    </tr> 
    <tr> 
      <td colspan="4" class="bottom"> 
        <table> 
          
          <tr> 
            <th class="light-grey">Queries</th> 
            <td class="white spaced-lines">&quot;Who is on the button?&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Commands</th> 
            <td class="white spaced-lines">&quot;Next player on the button.&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Constraints</th> 
            <td class="white spaced-lines">&quot;Only one player can be on the Dealer Button per hand.&quot;</td> 
          </tr> 
        </table> 
      </td> 
    </tr> 
  </table> 
</div> 
 
<div class="top-level" id="class_chart:DECK"> 
  <table class="outer"> 
    <tr class="top"> 
      <th class="type">CLASS</th> 
      <td class="name" colspan="2">DECK</td> 
      <td class="part"><strong>Part:</strong> 1/1</td> 
    </tr> 
    <tr class="middle"> 
      <td class="explanation" colspan="2"> 
        <dl> 
          <dt>Type Of Object</dt> 
          <dd>&quot;Represent the deck of 52 cards.&quot;</dd> 
        </dl> 
      </td> 
      <td class="indexing" colspan="2"> 
        <dl> 
          <dt>Indexing</dt> 
          <dd>in_cluster : "DEALER_ACTION";</dd> 
        </dl> 
      </td> 
    </tr> 
    <tr> 
      <td colspan="4" class="bottom"> 
        <table> 
          
          <tr> 
            <th class="light-grey">Queries</th> 
            <td class="white spaced-lines">&quot;Am I suffled?&quot;,<br/>&quot;How many cards left?&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Commands</th> 
            <td class="white spaced-lines">&quot;Shuffle up.&quot;,<br/>&quot;Deal cards.&quot;,<br/>&quot;Deal flop.&quot;,<br/>&quot;Deal turn.&quot;,<br/>&quot;Deal river.&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Constraints</th> 
            <td class="white spaced-lines">&quot;There is only one deck of cards.&quot;</td> 
          </tr> 
        </table> 
      </td> 
    </tr> 
  </table> 
</div> 
 
<div class="top-level" id="class_chart:CARD"> 
  <table class="outer"> 
    <tr class="top"> 
      <th class="type">CLASS</th> 
      <td class="name" colspan="2">CARD</td> 
      <td class="part"><strong>Part:</strong> 1/1</td> 
    </tr> 
    <tr class="middle"> 
      <td class="explanation" colspan="2"> 
        <dl> 
          <dt>Type Of Object</dt> 
          <dd>&quot;Represents on card.&quot;</dd> 
        </dl> 
      </td> 
      <td class="indexing" colspan="2"> 
        <dl> 
          <dt>Indexing</dt> 
          <dd>in_cluster : "DEALER_ACTION";</dd> 
        </dl> 
      </td> 
    </tr> 
    <tr> 
      <td colspan="4" class="bottom"> 
        <table> 
          
          <tr> 
            <th class="light-grey">Queries</th> 
            <td class="white spaced-lines">&quot;What is my value?&quot;,<br/>&quot;What is my suit?&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Commands</th> 
            <td class="white spaced-lines">&quot;Set value.&quot;,<br/>&quot;Set suit.&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Constraints</th> 
            <td class="white spaced-lines">&quot;Value: 2 to 9 | (T)Ten | (J)Jack | (Q)Queen | (K)King. Suit: (s)spades | (c)clubs | (d)diamonds | (h)hearts &quot;</td> 
          </tr> 
        </table> 
      </td> 
    </tr> 
  </table> 
</div> 
 
<div class="top-level" id="class_chart:POT"> 
  <table class="outer"> 
    <tr class="top"> 
      <th class="type">CLASS</th> 
      <td class="name" colspan="2">POT</td> 
      <td class="part"><strong>Part:</strong> 1/1</td> 
    </tr> 
    <tr class="middle"> 
      <td class="explanation" colspan="2"> 
        <dl> 
          <dt>Type Of Object</dt> 
          <dd>&quot;Represents the pot.&quot;</dd> 
        </dl> 
      </td> 
      <td class="indexing" colspan="2"> 
        <dl> 
          <dt>Indexing</dt> 
          <dd>in_cluster : "DEALER_ACTION";</dd> 
        </dl> 
      </td> 
    </tr> 
    <tr> 
      <td colspan="4" class="bottom"> 
        <table> 
          
          <tr> 
            <th class="light-grey">Queries</th> 
            <td class="white spaced-lines">&quot;What is the size of the pot?&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Commands</th> 
            <td class="white spaced-lines">&quot;Add bet to pot.&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Constraints</th> 
            <td class="white spaced-lines">&quot;No need for uniqueness there are several occassions for side pots.&quot;</td> 
          </tr> 
        </table> 
      </td> 
    </tr> 
  </table> 
</div> 
 
<div class="top-level" id="class_chart:BLIND"> 
  <table class="outer"> 
    <tr class="top"> 
      <th class="type">CLASS</th> 
      <td class="name" colspan="2">BLIND</td> 
      <td class="part"><strong>Part:</strong> 1/1</td> 
    </tr> 
    <tr class="middle"> 
      <td class="explanation" colspan="2"> 
        <dl> 
          <dt>Type Of Object</dt> 
          <dd>&quot;Level of the blind.&quot;</dd> 
        </dl> 
      </td> 
      <td class="indexing" colspan="2"> 
        <dl> 
          <dt>Indexing</dt> 
          <dd>in_cluster : "DEALER_ACTION";</dd> 
        </dl> 
      </td> 
    </tr> 
    <tr> 
      <td colspan="4" class="bottom"> 
        <table> 
          
          <tr> 
            <th class="light-grey">Queries</th> 
            <td class="white spaced-lines">&quot;What is the current level?&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Commands</th> 
            <td class="white spaced-lines">&quot;Increase blind.&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Constraints</th> 
            <td class="white spaced-lines">&quot;New blind value &gt; old blind value.&quot;</td> 
          </tr> 
        </table> 
      </td> 
    </tr> 
  </table> 
</div> 
 
<div class="top-level" id="class_chart:ANTE"> 
  <table class="outer"> 
    <tr class="top"> 
      <th class="type">CLASS</th> 
      <td class="name" colspan="2">ANTE</td> 
      <td class="part"><strong>Part:</strong> 1/1</td> 
    </tr> 
    <tr class="middle"> 
      <td class="explanation" colspan="2"> 
        <dl> 
          <dt>Type Of Object</dt> 
          <dd>&quot;Value of ante.&quot;</dd> 
        </dl> 
      </td> 
      <td class="indexing" colspan="2"> 
        <dl> 
          <dt>Indexing</dt> 
          <dd>in_cluster : "DEALER_ACTION";</dd> 
        </dl> 
      </td> 
    </tr> 
    <tr> 
      <td colspan="4" class="bottom"> 
        <table> 
          
          <tr> 
            <th class="light-grey">Queries</th> 
            <td class="white spaced-lines">&quot;What is the current ante?&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Commands</th> 
            <td class="white spaced-lines">&quot;Increase ante.&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Constraints</th> 
            <td class="white spaced-lines">&quot;New ante value &gt; old ante value.&quot;</td> 
          </tr> 
        </table> 
      </td> 
    </tr> 
  </table> 
</div> 
 
<div class="top-level" id="class_chart:BANK"> 
  <table class="outer"> 
    <tr class="top"> 
      <th class="type">CLASS</th> 
      <td class="name" colspan="2">BANK</td> 
      <td class="part"><strong>Part:</strong> 1/1</td> 
    </tr> 
    <tr class="middle"> 
      <td class="explanation" colspan="2"> 
        <dl> 
          <dt>Type Of Object</dt> 
          <dd>&quot;Player's amount of money.&quot;</dd> 
        </dl> 
      </td> 
      <td class="indexing" colspan="2"> 
        <dl> 
          <dt>Indexing</dt> 
          <dd>in_cluster : "POKER_PLAYER";</dd> 
        </dl> 
      </td> 
    </tr> 
    <tr> 
      <td colspan="4" class="bottom"> 
        <table> 
          
          <tr> 
            <th class="light-grey">Queries</th> 
            <td class="white spaced-lines">&quot;How much money do I have?&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Commands</th> 
            <td class="white spaced-lines">&quot;Add.&quot;,<br/>&quot;Subtract.&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Constraints</th> 
            <td class="white spaced-lines">&quot;Need to be legal amount&quot;</td> 
          </tr> 
        </table> 
      </td> 
    </tr> 
  </table> 
</div> 
 
<div class="top-level" id="class_chart:CARDS"> 
  <table class="outer"> 
    <tr class="top"> 
      <th class="type">CLASS</th> 
      <td class="name" colspan="2">CARDS</td> 
      <td class="part"><strong>Part:</strong> 1/1</td> 
    </tr> 
    <tr class="middle"> 
      <td class="explanation" colspan="2"> 
        <dl> 
          <dt>Type Of Object</dt> 
          <dd>&quot;The two initial cards for every hand.&quot;</dd> 
        </dl> 
      </td> 
      <td class="indexing" colspan="2"> 
        <dl> 
          <dt>Indexing</dt> 
          <dd>in_cluster : "POKER_PLAYER";</dd> 
        </dl> 
      </td> 
    </tr> 
    <tr> 
      <td colspan="4" class="bottom"> 
        <table> 
          
          <tr> 
            <th class="light-grey">Queries</th> 
            <td class="white spaced-lines">&quot;What are my cards?&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Commands</th> 
            <td class="white spaced-lines">&quot;Set Cards.&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Constraints</th> 
            <td class="white spaced-lines">&quot;Any two cards from the deck.&quot;</td> 
          </tr> 
        </table> 
      </td> 
    </tr> 
  </table> 
</div> 
 
<div class="top-level" id="class_chart:POKER_HAND"> 
  <table class="outer"> 
    <tr class="top"> 
      <th class="type">CLASS</th> 
      <td class="name" colspan="2">POKER_HAND</td> 
      <td class="part"><strong>Part:</strong> 1/1</td> 
    </tr> 
    <tr class="middle"> 
      <td class="explanation" colspan="2"> 
        <dl> 
          <dt>Type Of Object</dt> 
          <dd>&quot;The best out of five playing cards.&quot;</dd> 
        </dl> 
      </td> 
      <td class="indexing" colspan="2"> 
        <dl> 
          <dt>Indexing</dt> 
          <dd>in_cluster : "POKER_PLAYER";</dd> 
        </dl> 
      </td> 
    </tr> 
    <tr> 
      <td colspan="4" class="bottom"> 
        <table> 
          
          <tr> 
            <th class="light-grey">Queries</th> 
            <td class="white spaced-lines">&quot;Whats the best combination I get?&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Commands</th> 
            <td class="white spaced-lines">&quot;Show hand.&quot;</td> 
          </tr> 
          <tr> 
            <th class="light-grey">Constraints</th> 
            <td class="white spaced-lines">&quot;Requires game status to be showdown.&quot;</td> 
          </tr> 
        </table> 
      </td> 
    </tr> 
  </table> 
</div> 
 
<div class="top-level" id="system_chart:POKER"> 
  <table class="outer"> 
    <tr class="top"> 
      <th class="type">SYSTEM</th> 
      <td class="name" colspan="2">POKER</td> 
      <td class="part"><strong>Part:</strong> 1/1</td> 
    </tr> 
    <tr class="middle"> 
      <td class="explanation" colspan="2"> 
        <dl> 
          <dt>Purpose</dt> 
          <dd>&quot;This hopefully will be a fully functional funny NL Texas Hold 'Em poker application.&quot;</dd> 
        </dl> 
      </td> 
      <td class="indexing" colspan="2"> 
        <dl> 
          <dt>Indexing</dt> 
          <dd>author : "Chris";</dd> 
        </dl> 
      </td> 
    </tr> 
    <tr> 
      <td colspan="4" class="bottom"> 
        <table> 
          <tr> 
            <th class="grey">Cluster</th> 
            <th class="grey">Description</th> 
          </tr> 
          <tr> 
            <td class="light-grey"><a href="#cluster_chart:UTILITIES" onclick="return linkSelect('cluster_chart','cluster_chart:UTILITIES');">UTILITIES</a></td> 
            <td class="white">&quot;Utilities to implement functionality such as initilization.&quot;</td> 
          </tr>          <tr> 
            <td class="light-grey"><a href="#cluster_chart:POKER_TABLE" onclick="return linkSelect('cluster_chart','cluster_chart:POKER_TABLE');">POKER_TABLE</a></td> 
            <td class="white">&quot;Table cluster.&quot;</td> 
          </tr>          <tr> 
            <td class="light-grey"><a href="#cluster_chart:POKER_DEALER" onclick="return linkSelect('cluster_chart','cluster_chart:POKER_DEALER');">POKER_DEALER</a></td> 
            <td class="white">&quot;Dealer cluster.&quot;</td> 
          </tr> 
        </table> 
      </td> 
    </tr> 
  </table> 
</div> 
 
<div class="top-level" id="cluster_chart:POKER_TABLE"> 
  <table class="outer"> 
    <tr class="top"> 
      <th class="type">CLUSTER</th> 
      <td class="name" colspan="2">POKER_TABLE</td> 
      <td class="part"><strong>Part:</strong> 1/1</td> 
    </tr> 
    <tr class="middle"> 
      <td class="explanation" colspan="2"> 
        <dl> 
          <dt>Purpose</dt> 
          <dd>&quot;Cluster that holds all the structures for the table&quot;</dd> 
        </dl> 
      </td> 
      <td class="indexing" colspan="2"> 
        <dl> 
          <dt>Indexing</dt> 
        </dl> 
      </td> 
    </tr> 
    <tr> 
      <td colspan="4" class="bottom"> 
        <table> 
          <tr> 
            <th class="grey">Class</th> 
            <th class="grey">Description</th> 
          </tr> 
          <tr> 
            <td class="light-grey"><a href="#class_chart:TABLE" onclick="return linkSelect('class_chart','class_chart:TABLE');">TABLE</a></td> 
            <td class="white">&quot;Instance of a table.&quot;</td> 
          </tr>          <tr> 
            <td class="light-grey"><a href="#class_chart:GAME_STATE" onclick="return linkSelect('class_chart','class_chart:GAME_STATE');">GAME_STATE</a></td> 
            <td class="white">&quot;Part that keeps track of the game status.&quot;</td> 
          </tr>          <tr> 
            <td class="light-grey"><a href="#class_chart:SEAT" onclick="return linkSelect('class_chart','class_chart:SEAT');">SEAT</a></td> 
            <td class="white">&quot;Represents a seat at the table.&quot;</td> 
          </tr>          <tr> 
            <td class="light-grey"><a href="#class_chart:HISTORY" onclick="return linkSelect('class_chart','class_chart:HISTORY');">HISTORY</a></td> 
            <td class="white">&quot;History of every hand played at this table.&quot;</td> 
          </tr>          <tr> 
            <td class="light-grey"><a href="#class_chart:PLAYER" onclick="return linkSelect('class_chart','class_chart:PLAYER');">PLAYER</a></td> 
            <td class="white">&quot;Instance of a player.&quot;</td> 
          </tr>          <tr> 
            <td class="light-grey"><a href="#class_chart:DEALER" onclick="return linkSelect('class_chart','class_chart:DEALER');">DEALER</a></td> 
            <td class="white">&quot;Dealer of the game.&quot;</td> 
          </tr> 
        </table> 
        <table> 
          <tr> 
            <th>Cluster</th> 
            <th>Description</th> 
          </tr> 
          <tr> 
            <td class="light-grey"><a href="#cluster_chart:DEALER_ACTIONS" onclick="return linkSelect('cluster_chart','cluster_chart:DEALER_ACTIONS');">DEALER_ACTIONS</a></td> 
            <td class="white">&quot;Part that is responsible for all table actions from dealer aspect.&quot;</td> 
          </tr>          <tr> 
            <td class="light-grey"><a href="#cluster_chart:POKER_PLAYER" onclick="return linkSelect('cluster_chart','cluster_chart:POKER_PLAYER');">POKER_PLAYER</a></td> 
            <td class="white">&quot;Player cluster.&quot;</td> 
          </tr> 
        </table> 
      </td> 
    </tr> 
  </table> 
</div> 
 
<div class="top-level" id="cluster_chart:POKER_PLAYER"> 
  <table class="outer"> 
    <tr class="top"> 
      <th class="type">CLUSTER</th> 
      <td class="name" colspan="2">POKER_PLAYER</td> 
      <td class="part"><strong>Part:</strong> 1/1</td> 
    </tr> 
    <tr class="middle"> 
      <td class="explanation" colspan="2"> 
        <dl> 
          <dt>Purpose</dt> 
          <dd>&quot;Cluster that holds all the structures for the player.&quot;</dd> 
        </dl> 
      </td> 
      <td class="indexing" colspan="2"> 
        <dl> 
          <dt>Indexing</dt> 
        </dl> 
      </td> 
    </tr> 
    <tr> 
      <td colspan="4" class="bottom"> 
        <table> 
          <tr> 
            <th class="grey">Class</th> 
            <th class="grey">Description</th> 
          </tr> 
          <tr> 
            <td class="light-grey"><a href="#class_chart:BANK" onclick="return linkSelect('class_chart','class_chart:BANK');">BANK</a></td> 
            <td class="white">&quot;Player's amount of money.&quot;</td> 
          </tr>          <tr> 
            <td class="light-grey"><a href="#class_chart:CARDS" onclick="return linkSelect('class_chart','class_chart:CARDS');">CARDS</a></td> 
            <td class="white">&quot;Player's starting cards.&quot;</td> 
          </tr>          <tr> 
            <td class="light-grey"><a href="#class_chart:POKER_HAND" onclick="return linkSelect('class_chart','class_chart:POKER_HAND');">POKER_HAND</a></td> 
            <td class="white">&quot;The best out of five cards.&quot;</td> 
          </tr> 
        </table> 
              </td> 
    </tr> 
  </table> 
</div> 
 
<div class="top-level" id="cluster_chart:DEALER_ACTIONS"> 
  <table class="outer"> 
    <tr class="top"> 
      <th class="type">CLUSTER</th> 
      <td class="name" colspan="2">DEALER_ACTIONS</td> 
      <td class="part"><strong>Part:</strong> 1/1</td> 
    </tr> 
    <tr class="middle"> 
      <td class="explanation" colspan="2"> 
        <dl> 
          <dt>Purpose</dt> 
          <dd>&quot;Dealer is responsible for all above. Provides a general way of handling every action on the table.&quot;</dd> 
        </dl> 
      </td> 
      <td class="indexing" colspan="2"> 
        <dl> 
          <dt>Indexing</dt> 
          <dd>in_cluster : "POKER_TABLE";</dd> 
        </dl> 
      </td> 
    </tr> 
    <tr> 
      <td colspan="4" class="bottom"> 
        <table> 
          <tr> 
            <th class="grey">Class</th> 
            <th class="grey">Description</th> 
          </tr> 
          <tr> 
            <td class="light-grey"><a href="#class_chart:POT" onclick="return linkSelect('class_chart','class_chart:POT');">POT</a></td> 
            <td class="white">&quot;Current pot.&quot;</td> 
          </tr>          <tr> 
            <td class="light-grey"><a href="#class_chart:ANTE" onclick="return linkSelect('class_chart','class_chart:ANTE');">ANTE</a></td> 
            <td class="white">&quot;Value of ante.&quot;</td> 
          </tr>          <tr> 
            <td class="light-grey"><a href="#class_chart:BLIND" onclick="return linkSelect('class_chart','class_chart:BLIND');">BLIND</a></td> 
            <td class="white">&quot;Value of blinds.&quot;</td> 
          </tr>          <tr> 
            <td class="light-grey"><a href="#class_chart:CARD" onclick="return linkSelect('class_chart','class_chart:CARD');">CARD</a></td> 
            <td class="white">&quot;Representation of one card.&quot;</td> 
          </tr>          <tr> 
            <td class="light-grey"><a href="#class_chart:DECK" onclick="return linkSelect('class_chart','class_chart:DECK');">DECK</a></td> 
            <td class="white">&quot;Initial Deck of 52 cards.&quot;</td> 
          </tr>          <tr> 
            <td class="light-grey"><a href="#class_chart:BUTTON" onclick="return linkSelect('class_chart','class_chart:BUTTON');">BUTTON</a></td> 
            <td class="white">&quot;The player who will be dealt the last card.&quot;</td> 
          </tr> 
        </table> 
              </td> 
    </tr> 
  </table> 
</div> 
 
<div class="top-level" id="cluster_chart:UTILITIES"> 
  <table class="outer"> 
    <tr class="top"> 
      <th class="type">CLUSTER</th> 
      <td class="name" colspan="2">UTILITIES</td> 
      <td class="part"><strong>Part:</strong> 1/1</td> 
    </tr> 
    <tr class="middle"> 
      <td class="explanation" colspan="2"> 
        <dl> 
          <dt>Purpose</dt> 
          <dd></dd> 
        </dl> 
      </td> 
      <td class="indexing" colspan="2"> 
        <dl> 
          <dt>Indexing</dt> 
        </dl> 
      </td> 
    </tr> 
    <tr> 
      <td colspan="4" class="bottom"> 
        <table> 
          <tr> 
            <th class="grey">Class</th> 
            <th class="grey">Description</th> 
          </tr> 
          <tr> 
            <td class="light-grey"><a href="#class_chart:RANDOM_GENERATOR" onclick="return linkSelect('class_chart','class_chart:RANDOM_GENERATOR');">RANDOM_GENERATOR</a></td> 
            <td class="white">&quot;Facility for generating random numbers.&quot;</td> 
          </tr>          <tr> 
            <td class="light-grey"><a href="#class_chart:TEST_SUITE" onclick="return linkSelect('class_chart','class_chart:TEST_SUITE');">TEST_SUITE</a></td> 
            <td class="white">&quot;Facility for generated tests.&quot;</td> 
          </tr>          <tr> 
            <td class="light-grey"><a href="#class_chart:LOG_HANDLING" onclick="return linkSelect('class_chart','class_chart:LOG_HANDLING');">LOG_HANDLING</a></td> 
            <td class="white">&quot;Facility for logging.&quot;</td> 
          </tr> 
        </table> 
              </td> 
    </tr> 
  </table> 
</div> 
 
<div id="footer"> 
  <p id="left-footer"> 
    <button id="showlink" onclick="return toggleShowAll();">Show all</button> 
    Chart type:
    <select id="top-menu" onchange="populate(); showSelected();"><option>processing...</option></select> 
    Chart:
    <select id="sub-menu" onchange="showSelected();"><option>processing...</option></select> 
  </p> 
  <p id="right-footer"> 
    Generated by <a href="http://kind.ucd.ie/products/opensource/BONc">BONc</a> (version: bonc-0.2.6) <a href="http://validator.w3.org/check?uri=referer">XHTML</a> output, May 7, 2010 2:15:17 PM.
  </p> 
</div> 
 
</div> <!-- End main --> 
 
</body> 
</html> 
 
 */
package poker;
