package ch.brix.gql.client.frontify.builders;

public class CustomMetadataCatalogValue_entries extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.CustomMetadataCatalogEntry>> {
  public CustomMetadataCatalogValue_entries() {
    super(new ch.brix.gql.client.Call<>("entries", "CustomMetadataCatalogEntry"));
  }
  public CustomMetadataCatalogValue_entries onCustomMetadataCatalogEntry(On_CustomMetadataCatalogEntry typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
