package ch.brix.gql.client.frontify.builders;

public class RootMutation_ingestCatalogRows extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.IngestCatalogRows> {
  public RootMutation_ingestCatalogRows() {
    super(new ch.brix.gql.client.Call<>("ingestCatalogRows", "IngestCatalogRows"));
  }
  public RootMutation_ingestCatalogRows args(RootMutation_ingestCatalogRows_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_ingestCatalogRows onIngestCatalogRows(On_IngestCatalogRows typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
