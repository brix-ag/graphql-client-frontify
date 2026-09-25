package ch.brix.gql.client.frontify.builders;

public class RemoveCatalogColumnsBlocked_blockedColumns extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.CatalogColumnUsage>> {
  public RemoveCatalogColumnsBlocked_blockedColumns() {
    super(new ch.brix.gql.client.Call<>("blockedColumns", "CatalogColumnUsage"));
  }
  public RemoveCatalogColumnsBlocked_blockedColumns onCatalogColumnUsage(On_CatalogColumnUsage typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
