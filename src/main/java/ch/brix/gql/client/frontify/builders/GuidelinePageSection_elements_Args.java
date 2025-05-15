package ch.brix.gql.client.frontify.builders;

public class GuidelinePageSection_elements_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** Current page number.
   * Default value: 1
   */
  public GuidelinePageSection_elements_Args page(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("page", value);
    return this;
  }
  /**
   * How many `GuidelinePageSectionElement` to show per query.
   * Default value: 25
   */
  public GuidelinePageSection_elements_Args limit(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("limit", value);
    return this;
  }
}
