package ch.brix.gql.client.frontify.builders;

public class RemoveCatalogRowsBlocked_blockedRows extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.CatalogRowUsage>> {
  public RemoveCatalogRowsBlocked_blockedRows() {
    super(new ch.brix.gql.client.Call<>("blockedRows", "CatalogRowUsage"));
  }
  public RemoveCatalogRowsBlocked_blockedRows onCatalogRowUsage(On_CatalogRowUsage typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
