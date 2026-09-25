package ch.brix.gql.client.frontify.input_objects;

public class GuidelineContentSearchInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The term to search for
   */
  public GuidelineContentSearchInput searchTerm(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("searchTerm", v);
    return this;
  }
  /**
   * **BETA** Current page number.
   */
  @ch.brix.gql.client.DefaultValue("1")
  public GuidelineContentSearchInput page(ch.brix.gql.client.frontify.scalars.IntScalar v) {
    values.put("page", v);
    return this;
  }
  /**
   * **BETA** How many results to return per page. Min: 1, Max: 100.
   */
  @ch.brix.gql.client.DefaultValue("25")
  public GuidelineContentSearchInput limit(ch.brix.gql.client.frontify.scalars.IntScalar v) {
    values.put("limit", v);
    return this;
  }
  /**
   * **BETA** The locale tag ("de", "de-DE") to search in. If not provided, the guideline's default language will be used.
   */
  @ch.brix.gql.client.DefaultValue("null")
  public GuidelineContentSearchInput locale(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("locale", v);
    return this;
  }
  /**
   * **BETA** How close a hit must be to the search term before it is worth returning.
   */
  @ch.brix.gql.client.DefaultValue("DEFAULT")
  public GuidelineContentSearchInput searchRelevance(ch.brix.gql.client.frontify.enums.SearchRelevance v) {
    values.put("searchRelevance", v);
    return this;
  }
}
