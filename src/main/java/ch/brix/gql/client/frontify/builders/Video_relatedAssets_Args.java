package ch.brix.gql.client.frontify.builders;

public class Video_relatedAssets_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * How many `Asset` items to show per query. Min: 1, Max: 100.
   * Default value: 25
   */
  public Video_relatedAssets_Args limit(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("limit", value);
    return this;
  }
  /**
   * Current page number.
   * Default value: 1
   */
  public Video_relatedAssets_Args page(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("page", value);
    return this;
  }
}
