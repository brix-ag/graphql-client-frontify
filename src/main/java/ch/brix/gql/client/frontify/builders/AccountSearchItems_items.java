package ch.brix.gql.client.frontify.builders;

public class AccountSearchItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.unions.AccountSearchResult>> {
  public AccountSearchItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "AccountSearchResult"));
  }
  public AccountSearchItems_items onAudio(On_Audio typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AccountSearchItems_items onDocument(On_Document typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AccountSearchItems_items onEmbeddedContent(On_EmbeddedContent typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AccountSearchItems_items onFile(On_File typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AccountSearchItems_items onImage(On_Image typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AccountSearchItems_items onVideo(On_Video typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
