package ch.brix.gql.client.frontify.builders;

public class RootMutation_cancelExportCreatives_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** `CancelExportCreatives` input argument.
   * Default value: null
   */
  public RootMutation_cancelExportCreatives_Args input(ch.brix.gql.client.frontify.input_objects.CancelExportCreativesInput value) {
    _add_arg("input", value);
    return this;
  }
}
