package ch.brix.gql.client.frontify.builders;

public class CreateCatalog_catalog extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.Catalog> {
  public CreateCatalog_catalog() {
    super(new ch.brix.gql.client.Call<>("catalog", "Catalog"));
  }
  public CreateCatalog_catalog onCatalog(On_Catalog typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
