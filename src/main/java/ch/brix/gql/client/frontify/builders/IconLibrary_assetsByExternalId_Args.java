package ch.brix.gql.client.frontify.builders;

public class IconLibrary_assetsByExternalId_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * The externalId of the `Assets` to fetch.
   * Default value: null
   */
  public IconLibrary_assetsByExternalId_Args externalId(ch.brix.gql.client.frontify.scalars.IdScalar value) {
    _add_arg("externalId", value);
    return this;
  }
  /**
   * How many `Assets` to return per page. Min: 1, Max: 100.
   * Default value: 25
   */
  public IconLibrary_assetsByExternalId_Args limit(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("limit", value);
    return this;
  }
  /**
   * Opaque cursor from a previous page's `nextCursor`; omit for the first page.
   * Default value: null
   */
  public IconLibrary_assetsByExternalId_Args cursor(ch.brix.gql.client.frontify.scalars.StringScalar value) {
    _add_arg("cursor", value);
    return this;
  }
}
