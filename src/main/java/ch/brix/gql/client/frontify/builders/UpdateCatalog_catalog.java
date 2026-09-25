package ch.brix.gql.client.frontify.builders;

public class UpdateCatalog_catalog extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.Catalog> {
  public UpdateCatalog_catalog() {
    super(new ch.brix.gql.client.Call<>("catalog", "Catalog"));
  }
  public UpdateCatalog_catalog onCatalog(On_Catalog typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
