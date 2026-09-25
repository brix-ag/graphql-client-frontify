package ch.brix.gql.client.frontify.builders;

public class On_SetCatalogColumnAsPrimary extends ch.brix.gql.client.TypeBuilder {
  public On_SetCatalogColumnAsPrimary() {
    super(new ch.brix.gql.client.On("SetCatalogColumnAsPrimary"));
  }
  /**
   * **BETA** The `CatalogColumn` that was just set as primary key.
   */
  public On_SetCatalogColumnAsPrimary column(SetCatalogColumnAsPrimary_column callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
