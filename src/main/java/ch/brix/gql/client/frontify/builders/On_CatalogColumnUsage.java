package ch.brix.gql.client.frontify.builders;

public class On_CatalogColumnUsage extends ch.brix.gql.client.TypeBuilder {
  public On_CatalogColumnUsage() {
    super(new ch.brix.gql.client.On("CatalogColumnUsage"));
  }
  /**
   * **BETA** The in-use `CatalogColumn`.
   */
  public On_CatalogColumnUsage column(CatalogColumnUsage_column callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Why this `CatalogColumn` is currently in use.
   */
  public On_CatalogColumnUsage reasons() {
    _add_field("reasons");
    return this;
  }
}
