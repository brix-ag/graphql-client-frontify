package ch.brix.gql.client.frontify.builders;

public class RootQuery_guidelinePage_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** The id of the `GuidelinePage` to retrieve.
   * Default value: null
   */
  public RootQuery_guidelinePage_Args id(ch.brix.gql.client.frontify.scalars.IdScalar value) {
    _add_arg("id", value);
    return this;
  }
  /**
   * **BETA** Specifies the language in which the GuidelinePage should be delivered. If the requested language is unavailable, the default language will be used as a fallback.
   * Default value: null
   */
  public RootQuery_guidelinePage_Args language(ch.brix.gql.client.frontify.enums.LanguageCode value) {
    _add_arg("language", value);
    return this;
  }
}
