package ch.brix.gql.client.frontify.builders;

public class Library_searchAssets_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * Default value: null
   */
  public Library_searchAssets_Args input(ch.brix.gql.client.frontify.input_objects.AssetSearchInput value) {
    _add_arg("input", value);
    return this;
  }
}
