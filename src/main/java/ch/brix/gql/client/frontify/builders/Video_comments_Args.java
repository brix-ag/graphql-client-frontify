package ch.brix.gql.client.frontify.builders;

public class Video_comments_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * How many `AssetComment` items to show per query. Min: 1, Max: 100.
   * Default value: 25
   */
  public Video_comments_Args limit(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("limit", value);
    return this;
  }
  /**
   * Current page number.
   * Default value: 1
   */
  public Video_comments_Args page(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("page", value);
    return this;
  }
  /**
   * `AssetComment` query for results filtering.
   * Default value: null
   */
  public Video_comments_Args query(ch.brix.gql.client.frontify.input_objects.AssetCommentQueryInput value) {
    _add_arg("query", value);
    return this;
  }
}
