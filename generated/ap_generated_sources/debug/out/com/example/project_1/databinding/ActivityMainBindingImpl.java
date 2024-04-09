package com.example.project_1.databinding;
import com.example.project_1.R;
import com.example.project_1.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView, 1);
        sViewsWithIds.put(R.id.imageView3, 2);
        sViewsWithIds.put(R.id.textView, 3);
        sViewsWithIds.put(R.id.textView6, 4);
        sViewsWithIds.put(R.id.textView7, 5);
        sViewsWithIds.put(R.id.editTextText, 6);
        sViewsWithIds.put(R.id.editTextText2, 7);
        sViewsWithIds.put(R.id.button1, 8);
        sViewsWithIds.put(R.id.textView2, 9);
        sViewsWithIds.put(R.id.editTextText3, 10);
        sViewsWithIds.put(R.id.switch1, 11);
        sViewsWithIds.put(R.id.textView3, 12);
        sViewsWithIds.put(R.id.editTextText4, 13);
        sViewsWithIds.put(R.id.textView4, 14);
        sViewsWithIds.put(R.id.textView5, 15);
        sViewsWithIds.put(R.id.textView9, 16);
        sViewsWithIds.put(R.id.editTextText8, 17);
        sViewsWithIds.put(R.id.editTextText6, 18);
        sViewsWithIds.put(R.id.textView8, 19);
        sViewsWithIds.put(R.id.editTextText7, 20);
        sViewsWithIds.put(R.id.button2, 21);
        sViewsWithIds.put(R.id.progressBar, 22);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[8]
            , (android.widget.Button) bindings[21]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[7]
            , (android.widget.EditText) bindings[10]
            , (android.widget.EditText) bindings[13]
            , (android.widget.EditText) bindings[18]
            , (android.widget.EditText) bindings[20]
            , (android.widget.EditText) bindings[17]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ProgressBar) bindings[22]
            , (android.widget.Switch) bindings[11]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[16]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}