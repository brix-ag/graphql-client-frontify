package ch.brix.gql.client.frontify.builders;

public class RootMutation_removeMetadataValue_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `RemoveMetadataValue` input argument.
   * Default value: null
   */
  public RootMutation_removeMetadataValue_Args input(ch.brix.gql.client.frontify.input_objects.RemoveMetadataValueInput value) {
    _add_arg("input", value);
    return this;
  }
}
