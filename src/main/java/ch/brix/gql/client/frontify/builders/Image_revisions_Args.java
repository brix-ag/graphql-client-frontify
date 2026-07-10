package ch.brix.gql.client.frontify.builders;

public class Image_revisions_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * How many `AssetRevision` items to show per query. Min: 1, Max: 100.
   * Default value: 25
   */
  public Image_revisions_Args limit(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("limit", value);
    return this;
  }
  /**
   * Current page number.
   * Default value: 1
   */
  public Image_revisions_Args page(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("page", value);
    return this;
  }
}
