package ch.brix.gql.client.frontify.builders;

public class On_RemoveCatalogColumnsBlocked extends ch.brix.gql.client.TypeBuilder {
  public On_RemoveCatalogColumnsBlocked() {
    super(new ch.brix.gql.client.On("RemoveCatalogColumnsBlocked"));
  }
  /**
   * **BETA** The in-use `CatalogColumn`s that prevented the removal, with the reasons each is in use.
   */
  public On_RemoveCatalogColumnsBlocked blockedColumns(RemoveCatalogColumnsBlocked_blockedColumns callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
