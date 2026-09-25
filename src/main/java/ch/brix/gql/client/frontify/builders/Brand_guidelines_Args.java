package ch.brix.gql.client.frontify.builders;

public class Brand_guidelines_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** The locale tag ("de", "de-DE") in which the Guidelines should be delivered. This field must be set at the highest level in the GraphQL hierarchy. If the requested locale is unavailable, the default language will be used as a fallback.
   * Default value: null
   */
  public Brand_guidelines_Args locale(ch.brix.gql.client.frontify.scalars.StringScalar value) {
    _add_arg("locale", value);
    return this;
  }
  /**
   * **BETA** Specifies the language in which the Guidelines should be delivered. This field must be set at the highest level in the GraphQL hierarchy. If the requested language is unavailable, the default language will be used as a fallback.
   * Default value: null
   */
  public Brand_guidelines_Args language(ch.brix.gql.client.frontify.enums.LanguageCode value) {
    _add_arg("language", value);
    return this;
  }
  /**
   * **BETA** How many `GuidelineItems` to show per query. Min: 1, Max: 100.
   * Default value: 25
   */
  public Brand_guidelines_Args limit(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("limit", value);
    return this;
  }
  /**
   * Current page number.
   * Default value: 1
   */
  public Brand_guidelines_Args page(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("page", value);
    return this;
  }
}
