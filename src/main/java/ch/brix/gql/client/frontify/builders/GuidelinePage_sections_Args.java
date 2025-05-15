package ch.brix.gql.client.frontify.builders;

public class GuidelinePage_sections_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** How many `GuidelinePageSection` to show per query.
   * Default value: 25
   */
  public GuidelinePage_sections_Args limit(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("limit", value);
    return this;
  }
  /**
   * **BETA** Current page number.
   * Default value: 1
   */
  public GuidelinePage_sections_Args page(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("page", value);
    return this;
  }
}
