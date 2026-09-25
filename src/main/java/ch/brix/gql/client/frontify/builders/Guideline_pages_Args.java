package ch.brix.gql.client.frontify.builders;

public class Guideline_pages_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** How many `GuidelinePage` to show per query.
   * Default value: 25
   */
  public Guideline_pages_Args limit(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("limit", value);
    return this;
  }
  /**
   * **BETA** Current page number.
   * Default value: 1
   */
  public Guideline_pages_Args page(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("page", value);
    return this;
  }
}
