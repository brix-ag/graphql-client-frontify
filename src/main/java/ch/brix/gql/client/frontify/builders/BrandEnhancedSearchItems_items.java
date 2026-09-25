package ch.brix.gql.client.frontify.builders;

public class BrandEnhancedSearchItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.unions.BrandSearchResult>> {
  public BrandEnhancedSearchItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "BrandSearchResult"));
  }
  public BrandEnhancedSearchItems_items onAudio(On_Audio typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public BrandEnhancedSearchItems_items onDocument(On_Document typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public BrandEnhancedSearchItems_items onEmbeddedContent(On_EmbeddedContent typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public BrandEnhancedSearchItems_items onFile(On_File typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public BrandEnhancedSearchItems_items onImage(On_Image typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public BrandEnhancedSearchItems_items onVideo(On_Video typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
