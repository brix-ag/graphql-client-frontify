package ch.brix.gql.client.frontify.builders;

public class On_RemoveCatalogRowsBlocked extends ch.brix.gql.client.TypeBuilder {
  public On_RemoveCatalogRowsBlocked() {
    super(new ch.brix.gql.client.On("RemoveCatalogRowsBlocked"));
  }
  /**
   * **BETA** The in-use `CatalogRow`s that prevented the removal, with the reasons each is in use.
   */
  public On_RemoveCatalogRowsBlocked blockedRows(RemoveCatalogRowsBlocked_blockedRows callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
