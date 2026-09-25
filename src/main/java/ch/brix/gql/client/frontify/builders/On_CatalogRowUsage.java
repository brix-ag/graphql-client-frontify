package ch.brix.gql.client.frontify.builders;

public class On_CatalogRowUsage extends ch.brix.gql.client.TypeBuilder {
  public On_CatalogRowUsage() {
    super(new ch.brix.gql.client.On("CatalogRowUsage"));
  }
  /**
   * **BETA** The in-use `CatalogRow`.
   */
  public On_CatalogRowUsage row(CatalogRowUsage_row callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Why this `CatalogRow` is currently in use.
   */
  public On_CatalogRowUsage reasons() {
    _add_field("reasons");
    return this;
  }
}
